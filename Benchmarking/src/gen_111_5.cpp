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
  s1 f54(const s1 &v0) {
    const s0 v7 = v0.p1;
    const s0 v2 = v0.p1;
    const std::vector<s1> v6 { v0, v0, v0, v0, v0, v0 };
    const s1 v9(v2, v2);
    std::vector<s1> v10 = v6;
    const s1 v1(v7, v7);
    const s0 v24 = v9.p0;
    v10[2] = v1;
    const s1 v21(v24, v24);
    std::vector<s1> v18 = v10;
    const s1 v16 = v18[2];
    const s0 v39 = v16.p0;
    s1 v35 = v9;
    v35.p0 = v39;
    v10[5] = v21;
    return v35;
  }
  s1 f39(const s1 &v0) {
    const s1 v4 = f54(v0);
    const s0 v2 = v4.p0;
    const s1 v3(v2, v2);
    const s0 v12 = v3.p1;
    const s1 v9(v12, v2);
    return v9;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v4 = f39(v0);
    const s0 v3 = v4.p1;
    const std::vector<std::vector<double>> v5 = v3.p1;
    const std::vector<double> v7 = v5[0];
    const double v13 = v7[0];
    double v36 = v1;
    const std::vector<double> v38 { v13, v36, v13, v1, v1, v36, v13 };
    const double v62 = v38[2];
    double v86 = v62;
    return v86;
  }
  int main() {
    s1 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } });
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
