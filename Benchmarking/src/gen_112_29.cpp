  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    std::vector<std::vector<double>> p4;
    std::vector<std::vector<double>> p5;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3, std::vector<std::vector<double>> v4, std::vector<std::vector<double>> v5): p0(v0), p1(v1), p2(v2), p3(v3), p4(v4), p5(v5) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s1>> &v0, const double &v1) {
    const std::vector<s1> v5 = v0[0];
    const s1 v6 = v5[0];
    const s0 v10 = v6.p1;
    const s1 v11 = v5[0];
    const s0 v9 = v11.p0;
    const std::vector<std::vector<double>> v20 = v10.p3;
    const std::vector<double> v15 = v20[1];
    const std::vector<std::vector<double>> v31 = v9.p5;
    std::vector<std::vector<double>> v36 = v31;
    v36[0] = v15;
    const std::vector<double> v41 = v36[0];
    v36[0] = v15;
    const double v134 = v41[0];
    return v134;
  }
  int main() {
    std::vector<std::vector<s1>> v0({ { { { { { 0.0 }, { 1.0 } }, { { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } }, { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 } }, { { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } }, { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } });
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
