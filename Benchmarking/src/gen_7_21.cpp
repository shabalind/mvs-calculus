  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    double v6 = v1;
    const s1 v9 = v0[2];
    const std::vector<s0> v4 = v9.p1;
    const s0 v58 = v4[1];
    const std::vector<std::vector<double>> v21 = v58.p0;
    const std::vector<double> v47 = v21[0];
    const double v25 = v6 + v6;
    const double v55 = v47[0];
    std::vector<double> v26 = v47;
    v26[0] = v25;
    v26[0] = v55;
    v26 = v47;
    const double v102 = v26[0];
    return v102;
  }
  int main() {
    std::vector<s1> v0({ { { { { { { 0.0 } }, { { 1.0 } }, { { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } } }, { { { { 6.0 } }, { { 7.0 } }, { { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 } }, { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } }, { { { { { { 18.0 } }, { { 19.0 } }, { { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } }, { { { { 24.0 } }, { { 25.0 } }, { { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } }, { { { 30.0 } }, { { 31.0 } }, { { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } }, { { { { { { 36.0 } }, { { 37.0 } }, { { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } }, { { { { 42.0 } }, { { 43.0 } }, { { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } }, { { { 48.0 } }, { { 49.0 } }, { { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } } });
    double v1(54.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
