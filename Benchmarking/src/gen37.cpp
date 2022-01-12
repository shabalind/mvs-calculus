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
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s2 p0;
    s0 p1;
    s6(s2 v0, s0 v1): p0(v0), p1(v1) { }
  };
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    const s0 v4 = v0.p1;
    s0 v6 = v4;
    const std::vector<std::vector<double>> v13 = v4.p0;
    const std::vector<double> v7 = v13[1];
    v6.p0 = v13;
    const std::vector<std::vector<double>> v9 = v6.p0;
    std::vector<std::vector<double>> v18 = v9;
    const std::vector<std::vector<double>> v11 = v6.p0;
    std::vector<std::vector<double>> v14 = v9;
    v6.p0 = v11;
    std::vector<std::vector<double>> v23 = v18;
    const double v41 = v7[0];
    const std::vector<double> v31 = v13[0];
    std::vector<double> v22 = v7;
    v6.p0 = v14;
    const std::vector<std::vector<double>> v21 = v4.p0;
    v23[2] = v31;
    v22[0] = v41;
    v22 = v7;
    const std::vector<double> v33 = v18[2];
    v18[0] = v31;
    v23[2] = v22;
    v6.p0 = v13;
    v6.p0 = v21;
    v18[2] = v22;
    const std::vector<double> v26 = v23[1];
    v18[2] = v26;
    const double v61 = v33[0];
    v23[0] = v33;
    return v61;
  }
  int main() {
    s6 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } } }, { { { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } } } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } });
    double v1(20.0);
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
