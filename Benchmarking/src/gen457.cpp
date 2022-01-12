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
  s0 f21(const s0 &v0) {
    s0 v4 = v0;
    s0 v6 = v4;
    const std::vector<std::vector<double>> v2 = v0.p0;
    std::vector<std::vector<double>> v1 = v2;
    std::vector<std::vector<double>> v3 = v1;
    const std::vector<double> v7 = v3[0];
    std::vector<double> v5 = v7;
    const std::vector<std::vector<double>> v9 = v0.p1;
    v1[0] = v5;
    const std::vector<std::vector<double>> v11 = v6.p1;
    v1[0] = v5;
    v1[0] = v7;
    v4.p1 = v11;
    const double v16 = v7[0];
    v4.p1 = v9;
    const std::vector<std::vector<double>> v20 = v4.p0;
    v1[0] = v7;
    v5[0] = v16;
    v4.p0 = v1;
    const std::vector<double> v23 = v20[0];
    v3[0] = v5;
    v3[0] = v23;
    return v4;
  }
  s0 f11(const s0 &v0) {
    const s0 v18 = f21(v0);
    const s0 v13 = f21(v18);
    return v13;
  }
  s0 f4(const s0 &v0) {
    const s0 v7 = f21(v0);
    s0 v2 = v7;
    s0 v6 = v0;
    const std::vector<s0> v5 { v7, v6, v7, v7, v2 };
    const s0 v4 = v5[0];
    const s0 v3 = v5[1];
    const std::vector<std::vector<double>> v13 = v2.p1;
    v6.p0 = v13;
    std::vector<s0> v9 = v5;
    const s0 v19 = v9[0];
    const std::vector<std::vector<double>> v15 = v4.p0;
    const s0 v28 = v9[3];
    const std::vector<std::vector<s0>> v11 { v5, v5, v9, v9, v9 };
    const std::vector<std::vector<double>> v33 = v28.p0;
    v2.p0 = v33;
    const s0 v17 = f11(v4);
    std::vector<std::vector<s0>> v38 = v11;
    v38[2] = v9;
    const s0 v34 = f21(v4);
    const std::vector<std::vector<double>> v30 = v19.p0;
    s0 v27 = v3;
    std::vector<s0> v37 = v5;
    const s0 v53 = f21(v7);
    const std::vector<std::vector<double>> v51 = v27.p1;
    v27.p0 = v30;
    const s0 v36 = v37[2];
    v2 = v7;
    v37[3] = v28;
    const std::vector<std::vector<double>> v104 = v36.p1;
    v6.p1 = v104;
    const s0 v56 = f11(v4);
    v2 = v7;
    v6.p0 = v51;
    v37[1] = v34;
    const std::vector<s0> v73 = v38[2];
    v6.p1 = v15;
    const std::vector<std::vector<double>> v144 = v17.p1;
    const std::vector<std::vector<double>> v170 = v53.p0;
    v9 = v73;
    const s0 v87 = f21(v56);
    const std::vector<s0> v109 = v11[1];
    v27.p1 = v51;
    const s0 v118 = v109[3];
    v27.p0 = v170;
    std::vector<std::vector<double>> v92 = v144;
    v9[0] = v6;
    v9[0] = v87;
    v2.p0 = v92;
    return v118;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const s2 &v1, const double &v2) {
    const s1 v6 = v1.p1;
    const s0 v8 = v6.p1;
    const s0 v15 = f4(v8);
    const std::vector<std::vector<double>> v35 = v15.p1;
    const std::vector<double> v64 = v35[0];
    const double v70 = v64[0];
    return v70;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 } }, { { 1.0 } } }, { { { 2.0 } }, { { 3.0 } } }, { { { 4.0 } }, { { 5.0 } } } });
    s2 v1({ { { { 6.0 } }, { { 7.0 } } }, { { { { 8.0 } }, { { 9.0 } } }, { { { 10.0 } }, { { 11.0 } } } } });
    double v2(12.0);
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
