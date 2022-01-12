  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s0 p2;
    s0 p3;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1, s0 v2, s0 v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v3 = v0[0];
    const s0 v4 = v3.p2;
    s0 v7 = v4;
    const std::vector<std::vector<double>> v15 = v4.p0;
    std::vector<std::vector<double>> v22 = v15;
    v7.p1 = v22;
    const std::vector<std::vector<double>> v41 = v7.p0;
    const std::vector<std::vector<double>> v28 = v7.p1;
    const std::vector<std::vector<double>> v17 = v7.p1;
    const std::vector<double> v16 = v22[0];
    v7.p1 = v17;
    v22[0] = v16;
    std::vector<std::vector<double>> v36 = v15;
    const std::vector<double> v37 = v28[0];
    v22[0] = v37;
    const s0 v39(v36, v17);
    v7 = v39;
    v7.p1 = v41;
    const double v72 = v16[0];
    return v72;
  }
  int main() {
    std::vector<s1> v0({ { { { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } }, { { { { { 6.0 } }, { { 7.0 } } } } }, { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 } } }, { { { 14.0 } }, { { 15.0 } } }, { { { 16.0 } }, { { 17.0 } } } }, { { { { { 18.0 } }, { { 19.0 } } } } }, { { { 20.0 } }, { { 21.0 } } }, { { { 22.0 } }, { { 23.0 } } } } });
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
