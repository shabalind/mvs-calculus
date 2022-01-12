  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const std::vector<std::vector<s0>> &v1, const std::vector<std::vector<s0>> &v2, const double &v3) {
    const std::vector<s0> v6 = v2[1];
    const s0 v11 = v6[0];
    const std::vector<std::vector<double>> v18 = v11.p0;
    const std::vector<double> v13 = v18[1];
    const std::vector<double> v14 = v18[0];
    std::vector<std::vector<double>> v12 = v18;
    v12[2] = v14;
    const s0 v21(v12, v12);
    const std::vector<std::vector<double>> v16 = v21.p0;
    v12[0] = v13;
    const std::vector<double> v44 = v16[1];
    const double v61 = v44[0];
    return v61;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } } });
    std::vector<std::vector<s0>> v2({ { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } }, { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } } });
    double v3(54.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
