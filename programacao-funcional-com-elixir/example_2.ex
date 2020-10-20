defmodule Example do
  def run_two do
    IO.puts "Example One"
    in_cels = %{ scale: :cels, temp: 40 }
    in_fahr = fahr_to_cels(in_cels)

    IO.inspect(in_cels)
    IO.inspect(in_fahr)
  end

  defp fahr_to_cels(data) do
    # alternative syntax
    data
    |> Map.update(:temp, 0, fn c -> c * 1.8 + 32 end)
    |> Map.update(:scale, :fahr, fn _s -> :fahr end)
  end
end

Example.run_two
