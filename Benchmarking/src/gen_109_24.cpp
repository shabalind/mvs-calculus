  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const std::vector<s0> v11 = v0.p1;
    const s0 v7 = v11[0];
    const std::vector<std::vector<double>> v5 = v7.p0;
    const std::vector<std::vector<double>> v10 = v7.p1;
    const std::vector<double> v12 = v5[1];
    const std::vector<double> v15 = v5[1];
    const double v16 = v15[0];
    std::vector<std::vector<double>> v27 = v10;
    v27[1] = v15;
    const double v45 = v1 / v1;
    const std::vector<double> v41 = v27[0];
    const double v74 = v41[0];
    v27[0] = v12;
    const double v161 = v16 - v74;
    const double v67 = v45 * v161;
    return v67;
  }
  int main() {
    s1 v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } }, { { 5.0 } } } } }, { { { { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 }, { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } });
    double v1(24.0);
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
