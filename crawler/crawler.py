from bs4 import BeautifulSoup
import requests

url = 'https://www.imdb.com/chart/top/?ref_=nv_mv_250'

def get_html(url):
  return requests.get(url).text

def get_movies(html):
  soup = BeautifulSoup(html, 'html.parser')
  tbody = soup.find('tbody', {'class': 'lister-list'})
  table_rows = tbody.find_all('tr')

  for row in table_rows:
    title_column = row.find('td', {'class': 'titleColumn'})
    title = title_column.a.text

    rating = row.find('td', {'class': 'imdbRating'}).strong.text
    print(title, ':', rating)

html = get_html(url)
get_movies(html)
