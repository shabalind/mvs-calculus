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
  double f0(const s0 &v0, const std::vector<s1> &v1, const std::vector<s0> &v2, const double &v3) {
    const s1 v6 = v1[0];
    const std::vector<std::vector<double>> v7 = v0.p1;
    const std::vector<std::vector<double>> v5 = v0.p0;
    const s0 v14 = v6.p0;
    const s1 v15 = v1[2];
    const std::vector<double> v16 = v7[0];
    const s0 v12 = v15.p1;
    const std::vector<std::vector<double>> v4 = v12.p1;
    const s1 v10 = v1[0];
    const s0 v20 = v10.p0;
    s0 v13 = v20;
    std::vector<std::vector<double>> v23 = v5;
    const std::vector<double> v17 = v23[0];
    v23[0] = v16;
    const s0 v27 = v6.p1;
    s1 v33 = v10;
    v33.p1 = v14;
    const s0 v45 = v33.p0;
    v33.p1 = v27;
    const std::vector<double> v40 = v23[0];
    const std::vector<std::vector<double>> v25 = v45.p1;
    const double v49 = v40[0];
    v23[0] = v40;
    std::vector<double> v62 = v17;
    v62 = v40;
    v13.p1 = v4;
    const std::vector<double> v47 = v25[1];
    const double v88 = v49 / v49;
    const double v66 = v47[0];
    v23[0] = v47;
    v23[0] = v62;
    double v134 = v88;
    v33.p0 = v13;
    v62[0] = v49;
    v62[0] = v66;
    v13.p0 = v23;
    double v107 = v134;
    return v107;
  }
  int main() {
    s0 v0({ { { 0.0 } }, { { 1.0 }, { 2.0 } } });
    std::vector<s1> v1({ { { { { 3.0 } }, { { 4.0 }, { 5.0 } } }, { { { 6.0 } }, { { 7.0 }, { 8.0 } } } }, { { { { 9.0 } }, { { 10.0 }, { 11.0 } } }, { { { 12.0 } }, { { 13.0 }, { 14.0 } } } }, { { { { 15.0 } }, { { 16.0 }, { 17.0 } } }, { { { 18.0 } }, { { 19.0 }, { 20.0 } } } } });
    std::vector<s0> v2({ { { { 21.0 } }, { { 22.0 }, { 23.0 } } }, { { { 24.0 } }, { { 25.0 }, { 26.0 } } } });
    double v3(27.0);
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
