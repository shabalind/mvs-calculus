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
  struct s2 {
    std::vector<s1> p0;
    s0 p1;
    s2(std::vector<s1> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s2> p0;
    s0 p1;
    s7(std::vector<s2> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f90(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p0;
    const std::vector<std::vector<double>> v9 = v0.p1;
    const s0 v4(v6, v9);
    const std::vector<s0> v12 { v0, v0, v4 };
    std::vector<s0> v7 = v12;
    v7[0] = v4;
    const s0 v10 = v7[1];
    const s0 v33 = v12[2];
    const s0 v26 = v12[0];
    const std::vector<s0> v22 { v33, v26, v0, v10, v4, v26 };
    const s0 v83 = v22[5];
    v7[0] = v4;
    return v83;
  }
  s0 f15(const s0 &v0) {
    const s0 v5 = f90(v0);
    const s0 v9 = f90(v5);
    const s0 v7 = f90(v9);
    const std::vector<std::vector<double>> v51 = v9.p1;
    s0 v28 = v7;
    v28.p0 = v51;
    return v28;
  }
  __attribute__((noinline))
  double f0(const s7 &v0, const double &v1) {
    const s0 v7 = v0.p1;
    double v9 = v1;
    const s0 v26 = f15(v7);
    const s0 v20 = f90(v26);
    double v27 = v9;
    const std::vector<std::vector<double>> v58 = v20.p0;
    const std::vector<double> v72 = v58[1];
    const double v34 = v72[0];
    const double v54 = v27 - v9;
    double v79 = v54;
    const double v163 = v79 / v34;
    return v163;
  }
  int main() {
    s7 v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } } }, { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } });
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
