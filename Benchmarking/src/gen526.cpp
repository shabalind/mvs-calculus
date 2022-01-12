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
    s0 p0;
    s1 p1;
    s2(s0 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    std::vector<s0> p0;
    s0 p1;
    s8(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s2 f98(const s2 &v0) {
    const s0 v7 = v0.p0;
    const s1 v3 = v0.p1;
    const s1 v6 = v0.p1;
    s1 v5 = v6;
    v5 = v3;
    s1 v4 = v6;
    v5 = v6;
    v4.p0 = v7;
    v4.p0 = v7;
    v4.p0 = v7;
    const s0 v8 = v0.p0;
    v4.p0 = v8;
    s0 v1 = v8;
    s0 v13 = v1;
    const s0 v11 = v4.p0;
    v4.p0 = v11;
    const s1 v27 = v0.p1;
    v13 = v8;
    const s0 v14 = v27.p1;
    const s0 v24 = v27.p0;
    const std::vector<std::vector<double>> v30 = v8.p1;
    const std::vector<std::vector<double>> v15 = v24.p0;
    const s2 v19(v14, v5);
    std::vector<std::vector<double>> v34 = v15;
    v1.p1 = v30;
    std::vector<std::vector<double>> v28 = v30;
    v5.p1 = v11;
    v1.p0 = v15;
    const std::vector<double> v73 = v15[1];
    v28[0] = v73;
    v13.p1 = v28;
    const std::vector<double> v65 = v34[1];
    v5.p1 = v14;
    v4.p0 = v13;
    v34[0] = v73;
    std::vector<std::vector<double>> v38 = v34;
    v38[0] = v65;
    v1.p0 = v38;
    return v19;
  }
  s0 f84(const s0 &v0) {
    const std::vector<std::vector<double>> v6 = v0.p1;
    const std::vector<std::vector<double>> v24 = v0.p0;
    s0 v10 = v0;
    v10.p1 = v6;
    v10.p0 = v24;
    const std::vector<std::vector<double>> v19 = v10.p1;
    const s1 v30(v0, v10);
    const s0 v27 = v30.p1;
    v10.p1 = v19;
    const s2 v40(v27, v30);
    s2 v38 = v40;
    const s2 v23 = f98(v38);
    v10.p1 = v19;
    v38.p1 = v30;
    const s0 v88 = v30.p0;
    const s1 v78 = v23.p1;
    const s0 v97 = v78.p0;
    v38.p0 = v88;
    v38.p0 = v88;
    v10.p0 = v24;
    return v97;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const std::vector<std::vector<s8>> &v1, const double &v2) {
    const std::vector<s8> v6 = v1[0];
    const s8 v4 = v6[0];
    const s0 v8 = v4.p1;
    const s0 v3 = f84(v8);
    const std::vector<std::vector<double>> v13 = v3.p1;
    const std::vector<double> v35 = v13[0];
    const double v49 = v35[0];
    const double v71 = v49 + v2;
    const std::vector<double> v111 { v49, v71 };
    std::vector<double> v87 = v111;
    const double v83 = v87[0];
    return v83;
  }
  int main() {
    s2 v0({ { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } }, { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } } } });
    std::vector<std::vector<s8>> v1({ { { { { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } }, { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } } } });
    double v2(25.0);
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
