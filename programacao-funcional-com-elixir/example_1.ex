defmodule Example do
  def run_one do
    IO.puts "Example One"
    in_fahr = %{ scale: :fahr, temp: 40 }
    in_cels = fahr_to_cels(in_fahr)

    IO.inspect(in_fahr)
    IO.inspect(in_cels)
  end

  defp fahr_to_cels(data) do
    Map.update(
      Map.update(data, :temp, 0, fn f -> (f - 32) / 1.8 end),
      :scale, :cels, fn _s -> :cels end
    )
  end
end

Example.run_one
