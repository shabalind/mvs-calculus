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
    s0 p1;
    s1(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s1 f50(const s1 &v0) {
    s1 v37 = v0;
    return v37;
  }
  s0 f41(const s0 &v0) {
    s0 v7 = v0;
    s0 v8 = v0;
    s0 v2 = v7;
    s0 v3 = v8;
    const std::vector<std::vector<double>> v10 = v3.p1;
    const std::vector<std::vector<double>> v4 = v2.p1;
    v7.p1 = v4;
    std::vector<std::vector<double>> v1 = v10;
    std::vector<std::vector<double>> v12 = v4;
    std::vector<std::vector<double>> v6 = v12;
    const std::vector<s0> v22 { v8, v0, v0, v7, v2, v2 };
    const std::vector<std::vector<double>> v31 = v2.p0;
    const std::vector<double> v19 = v1[0];
    const std::vector<std::vector<double>> v28 = v0.p0;
    v2 = v7;
    v1[0] = v19;
    std::vector<s0> v18 = v22;
    const std::vector<double> v16 = v4[0];
    v7.p0 = v31;
    v18[2] = v0;
    const std::vector<std::vector<double>> v24 = v3.p0;
    std::vector<double> v21 = v16;
    v18[0] = v3;
    const std::vector<std::vector<double>> v37 = v8.p1;
    const s0 v29 = v22[4];
    v7.p1 = v6;
    const std::vector<double> v60 = v4[0];
    const std::vector<std::vector<double>> v62 = v2.p0;
    const std::vector<std::vector<double>> v35 = v7.p1;
    v6[0] = v19;
    const double v39 = v19[0];
    v1[0] = v21;
    v7.p1 = v35;
    v3.p0 = v24;
    std::vector<std::vector<double>> v32 = v62;
    v3.p0 = v62;
    v2.p0 = v28;
    v3.p0 = v32;
    const std::vector<std::vector<double>> v57 = v0.p1;
    v6[0] = v60;
    double v40 = v39;
    const std::vector<std::vector<double>> v61 = v29.p1;
    v2.p1 = v37;
    v7.p0 = v32;
    v7.p1 = v35;
    v7.p1 = v57;
    v2.p1 = v61;
    v21[0] = v40;
    const s0 v74 = v18[5];
    v2.p0 = v31;
    return v74;
  }
  s1 f21(const s1 &v0, const s1 &v1) {
    s1 v3 = v1;
    s1 v7 = v3;
    const std::vector<s0> v5 = v7.p0;
    const s1 v9 = f50(v7);
    std::vector<s0> v10 = v5;
    v3.p0 = v10;
    return v9;
  }
  s0 f13(const s0 &v0) {
    s0 v6 = v0;
    const std::vector<std::vector<double>> v3 = v0.p0;
    v6.p0 = v3;
    s0 v12 = v0;
    const s0 v20 = f41(v6);
    v6 = v12;
    const s0 v25 = f41(v20);
    return v25;
  }
  __attribute__((noinline))
  double f0(const std::vector<s0> &v0, const std::vector<s0> &v1, const double &v2) {
    std::vector<s0> v8 = v0;
    v8 = v0;
    const s0 v12 = v8[0];
    v8[0] = v12;
    v8 = v0;
    const s0 v11 = f13(v12);
    const std::vector<std::vector<double>> v17 = v11.p1;
    v8[0] = v11;
    const s0 v24 = v8[0];
    const std::vector<double> v68 = v17[0];
    const s0 v19 = v8[0];
    v8[0] = v19;
    const s1 v23(v0, v11);
    const s0 v50 = f13(v24);
    v8[0] = v50;
    std::vector<double> v73 = v68;
    const s1 v30 = f21(v23, v23);
    double v32 = v2;
    const double v47 = v68[0];
    v73[0] = v47;
    v8[0] = v12;
    const double v84 = v73[0];
    const s0 v80 = v30.p1;
    v8[0] = v80;
    const double v98 = v84 + v32;
    return v98;
  }
  int main() {
    std::vector<s0> v0({ { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } } });
    std::vector<s0> v1({ { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } });
    double v2(16.0);
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
