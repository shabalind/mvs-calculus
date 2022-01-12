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
  __attribute__((noinline))
  double f0(const s0 &v0, const std::vector<std::vector<s0>> &v1, const double &v2) {
    s0 v4 = v0;
    const std::vector<s0> v6 = v1[0];
    const s0 v7 = v6[0];
    const std::vector<std::vector<double>> v8 = v4.p3;
    const std::vector<std::vector<double>> v5 = v7.p2;
    v4.p3 = v8;
    const std::vector<std::vector<double>> v9 = v4.p1;
    v4.p3 = v8;
    const std::vector<std::vector<double>> v12 = v0.p2;
    v4.p2 = v12;
    v4.p2 = v5;
    const std::vector<std::vector<double>> v29 = v4.p2;
    v4.p3 = v9;
    const std::vector<double> v64 = v29[0];
    const double v58 = v64[0];
    return v58;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } } });
    std::vector<std::vector<s0>> v1({ { { { { 9.0 }, { 10.0 } }, { { 11.0 }, { 12.0 }, { 13.0 } }, { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } });
    double v2(18.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
