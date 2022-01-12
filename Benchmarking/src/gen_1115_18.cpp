  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    s0 p1;
    s1(std::vector<std::vector<s0>> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f43(const s0 &v0) {
    const std::vector<std::vector<double>> v4 = v0.p0;
    const std::vector<std::vector<double>> v9 = v0.p1;
    s0 v16 = v0;
    const std::vector<std::vector<double>> v35 = v16.p1;
    v16.p0 = v4;
    const std::vector<std::vector<double>> v14 = v0.p0;
    s0 v24 = v0;
    v16.p1 = v9;
    const std::vector<std::vector<double>> v33 = v24.p0;
    v24.p1 = v35;
    v24.p1 = v9;
    const std::vector<std::vector<double>> v54 = v24.p0;
    v24.p0 = v14;
    v24.p0 = v54;
    v24.p0 = v33;
    const std::vector<std::vector<double>> v95 = v24.p0;
    v16.p0 = v95;
    return v24;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v7 = v0[0];
    const s0 v5 = v7.p1;
    const s0 v2 = f43(v5);
    const std::vector<std::vector<double>> v10 = v2.p1;
    double v13 = v1;
    double v12 = v13;
    const std::vector<double> v31 = v10[0];
    const double v27 = v31[0];
    const std::vector<double> v32 = v10[0];
    double v16 = v13;
    const double v59 = v32[0];
    const std::vector<double> v61 { v59, v16, v1, v12, v27, v59 };
    const double v94 = v61[4];
    return v94;
  }
  int main() {
    std::vector<s1> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } });
    double v1(6.0);
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
