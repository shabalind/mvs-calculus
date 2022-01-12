  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    double p0;
    std::vector<std::vector<double>> p1;
    s0(double v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    std::vector<s1> p1;
    s2(std::vector<s0> v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<std::vector<s1>> p0;
    std::vector<s2> p1;
    s6(std::vector<std::vector<s1>> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  double f25(const double &v0) {
    double v5 = v0;
    const double v7 = v0 * v5;
    const double v6 = v7 + v7;
    double v1 = v5;
    double v2 = v7;
    double v10 = v5;
    double v8 = v10;
    double v4 = v2;
    double v13 = v0;
    double v9 = v2;
    const double v12 = v6 - v7;
    double v25 = v12;
    double v14 = v1;
    double v16 = v8;
    double v19 = v13;
    const double v43 = v25 / v9;
    double v21 = v13;
    double v22 = v16;
    double v34 = v5;
    double v20 = v6;
    double v24 = v34;
    double v11 = v14;
    double v28 = v2;
    double v17 = v28;
    double v47 = v4;
    double v27 = v7;
    v10 = v2;
    double v39 = v47;
    v14 = v24;
    double v57 = v27;
    double v52 = v6;
    double v90 = v21;
    const double v66 = v20 + v19;
    const std::vector<double> v101 { v52, v25, v13, v57 };
    std::vector<double> v73 = v101;
    const double v78 = v101[0];
    const double v68 = v73[0];
    v73[2] = v66;
    v73[2] = v68;
    v73[3] = v43;
    const std::vector<double> v245 { v78, v90, v21, v17, v14, v22, v11 };
    std::vector<double> v111 = v245;
    v27 = v39;
    const double v71 = v73[0];
    v1 = v71;
    std::vector<double> v160 = v111;
    const std::vector<std::vector<double>> v122 { v245, v160, v160, v111, v111, v111, v111 };
    const std::vector<double> v115 = v122[4];
    v160[6] = v6;
    v25 = v27;
    const double v150 = v115[2];
    v111[4] = v6;
    return v150;
  }
  __attribute__((noinline))
  double f0(const s6 &v0, const double &v1) {
    double v6 = v1;
    const double v13 = f25(v6);
    return v13;
  }
  int main() {
    s6 v0({ { { { { 0.0, { { 1.0 } } }, { 2.0, { { 3.0 } } } } }, { { { 4.0, { { 5.0 } } }, { 6.0, { { 7.0 } } } } } }, { { { { 8.0, { { 9.0 } } }, { 10.0, { { 11.0 } } } }, { { { 12.0, { { 13.0 } } }, { 14.0, { { 15.0 } } } } } }, { { { 16.0, { { 17.0 } } }, { 18.0, { { 19.0 } } } }, { { { 20.0, { { 21.0 } } }, { 22.0, { { 23.0 } } } } } }, { { { 24.0, { { 25.0 } } }, { 26.0, { { 27.0 } } } }, { { { 28.0, { { 29.0 } } }, { 30.0, { { 31.0 } } } } } } } });
    double v1(32.0);
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
