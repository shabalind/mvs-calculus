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
    std::vector<s0> p1;
    s1(s0 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  s0 f50(const s0 &v0) {
    s0 v7 = v0;
    s0 v3 = v0;
    s0 v2 = v0;
    v3 = v7;
    const std::vector<std::vector<double>> v8 = v3.p1;
    v2.p1 = v8;
    const std::vector<double> v4 = v8[0];
    v2 = v7;
    std::vector<std::vector<double>> v6 = v8;
    v2.p1 = v8;
    v6[0] = v4;
    std::vector<std::vector<double>> v14 = v6;
    v3.p1 = v6;
    const std::vector<std::vector<double>> v12 = v0.p0;
    std::vector<std::vector<double>> v15 = v12;
    v2.p0 = v12;
    v15[0] = v4;
    v2.p0 = v12;
    const s0 v13(v15, v14);
    std::vector<std::vector<double>> v11 = v14;
    const std::vector<std::vector<std::vector<double>>> v24 { v11, v14, v14, v6, v8 };
    const std::vector<double> v43 = v6[0];
    v3.p1 = v6;
    std::vector<std::vector<std::vector<double>>> v19 = v24;
    v7.p0 = v15;
    std::vector<std::vector<double>> v23 = v15;
    const std::vector<std::vector<double>> v26 = v2.p1;
    std::vector<std::vector<double>> v47 = v8;
    v2.p1 = v26;
    const std::vector<std::vector<double>> v32 = v0.p0;
    const std::vector<std::vector<double>> v65 = v19[2];
    v7.p0 = v32;
    const std::vector<std::vector<double>> v28 = v7.p0;
    s0 v48 = v0;
    v2.p1 = v8;
    s0 v80 = v2;
    v2.p0 = v28;
    const s0 v70(v23, v65);
    const std::vector<s0> v150 { v13, v48, v70, v80, v0, v7 };
    const std::vector<std::vector<double>> v83 = v0.p0;
    v2.p1 = v8;
    v6[0] = v4;
    v48.p1 = v14;
    v7.p1 = v47;
    v7.p0 = v83;
    std::vector<double> v100 = v43;
    const s0 v85 = v150[2];
    v6[0] = v100;
    v7.p1 = v8;
    v11[0] = v43;
    const std::vector<std::vector<double>> v69 = v2.p1;
    const std::vector<std::vector<double>> v145 = v48.p0;
    v3.p1 = v69;
    v80.p0 = v145;
    return v85;
  }
  __attribute__((noinline))
  double f0(const std::vector<s1> &v0, const double &v1) {
    const s1 v4 = v0[1];
    const s0 v3 = v4.p0;
    const s0 v8 = f50(v3);
    const s0 v17 = f50(v8);
    const std::vector<std::vector<double>> v18 = v17.p0;
    const std::vector<double> v27 = v18[1];
    const double v30 = v27[0];
    const double v96 = v27[0];
    const double v58 = v96 - v30;
    double v132 = v58;
    return v132;
  }
  int main() {
    std::vector<s1> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } }, { { { 6.0 }, { 7.0 } }, { { 8.0 } } }, { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } }, { { { { 15.0 }, { 16.0 } }, { { 17.0 } } }, { { { 18.0 }, { 19.0 } }, { { 20.0 } } }, { { { 21.0 }, { 22.0 } }, { { 23.0 } } } } } });
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
