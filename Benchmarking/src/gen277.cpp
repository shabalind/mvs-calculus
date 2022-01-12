  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    double p0;
    s0 p1;
    s3(double v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    s3 p1;
    s4(s3 v0, s3 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    std::vector<s3> p0;
    s4 p1;
    s6(std::vector<s3> v0, s4 v1): p0(v0), p1(v1) { }
  };
  s6 f112(const s6 &v0) {
    s6 v6 = v0;
    s6 v1 = v6;
    s6 v4 = v1;
    const s4 v3 = v1.p1;
    v6.p1 = v3;
    return v4;
  }
  s0 f89(const s0 &v0, const s0 &v1) {
    const std::vector<std::vector<double>> v6 = v0.p3;
    s0 v3 = v0;
    const std::vector<std::vector<double>> v8 = v3.p2;
    const std::vector<std::vector<double>> v4 = v0.p2;
    s0 v9 = v1;
    const std::vector<std::vector<double>> v2 = v9.p3;
    v9.p3 = v6;
    const std::vector<double> v5 = v8[0];
    s0 v15 = v0;
    const std::vector<std::vector<double>> v22 = v15.p2;
    s0 v12 = v15;
    std::vector<double> v13 = v5;
    const double v7 = v13[0];
    v15.p1 = v8;
    v9.p2 = v4;
    v12.p2 = v4;
    const double v11 = v13[0];
    const double v10 = v5[0];
    v13[0] = v10;
    v15.p0 = v8;
    std::vector<double> v17 = v5;
    v12.p0 = v22;
    const std::vector<std::vector<double>> v26 = v15.p0;
    const double v16 = v7 - v11;
    const std::vector<std::vector<double>> v14 = v15.p3;
    v9.p1 = v14;
    v13[0] = v16;
    v3.p0 = v2;
    const std::vector<double> v25 = v2[0];
    v13[0] = v11;
    v9.p3 = v22;
    v15.p3 = v2;
    v17[0] = v16;
    v3.p0 = v2;
    v15.p0 = v8;
    v15.p2 = v8;
    std::vector<std::vector<double>> v84 = v26;
    s0 v51 = v3;
    v84[0] = v17;
    const s1 v43(v51, v12);
    s1 v61 = v43;
    std::vector<std::vector<double>> v149 = v8;
    const std::vector<double> v52 = v149[0];
    v3.p1 = v84;
    v84[0] = v52;
    const s0 v58 = v61.p1;
    v15.p2 = v149;
    v84[0] = v25;
    v15.p2 = v22;
    v61.p0 = v12;
    return v58;
  }
  s6 f81(const s6 &v0) {
    const s4 v1 = v0.p1;
    s6 v3 = v0;
    v3 = v0;
    const s4 v5 = v3.p1;
    v3.p1 = v5;
    const std::vector<s4> v8 { v5, v1, v5, v1, v5, v1, v5 };
    s6 v6 = v0;
    v6.p1 = v5;
    s6 v16 = v6;
    const s4 v25 = v8[6];
    v16.p1 = v25;
    v6.p1 = v25;
    return v16;
  }
  s6 f62(const s6 &v0) {
    s6 v2 = v0;
    s6 v6 = v2;
    const std::vector<s3> v10 = v6.p0;
    v2.p0 = v10;
    return v6;
  }
  double f6(const s4 &v0, const double &v1) {
    const s3 v8 = v0.p0;
    const s0 v11 = v8.p1;
    s0 v12 = v11;
    const s0 v10 = f89(v12, v11);
    const s0 v26 = f89(v11, v11);
    const s0 v43 = f89(v26, v26);
    const s0 v23 = f89(v10, v43);
    const std::vector<std::vector<double>> v33 = v23.p2;
    const std::vector<double> v47 = v33[0];
    const double v68 = v8.p0;
    const double v51 = v47[0];
    const double v53 = v51 * v68;
    v12.p2 = v33;
    return v53;
  }
  __attribute__((noinline))
  double f0(const std::vector<s6> &v0, const double &v1) {
    double v7 = v1;
    const s6 v2 = v0[0];
    const s6 v4 = f62(v2);
    const s6 v6 = f81(v4);
    const s6 v11 = f62(v2);
    double v9 = v7;
    s6 v10 = v6;
    const s6 v12 = f112(v11);
    const s6 v16 = v0[0];
    const s6 v14 = f112(v10);
    const std::vector<s6> v21 { v14, v6, v4, v12, v16, v2 };
    double v20 = v9;
    const s6 v37 = f62(v10);
    const s6 v39 = v21[2];
    const std::vector<s3> v42 = v37.p0;
    v10.p0 = v42;
    v10.p0 = v42;
    const s4 v68 = v39.p1;
    v10.p0 = v42;
    v10.p0 = v42;
    const double v150 = f6(v68, v20);
    const double v134 = v150 * v1;
    return v134;
  }
  int main() {
    std::vector<s6> v0({ { { { 0.0, { { { 1.0 } }, { { 2.0 } }, { { 3.0 } }, { { 4.0 } } } } }, { { 5.0, { { { 6.0 } }, { { 7.0 } }, { { 8.0 } }, { { 9.0 } } } }, { 10.0, { { { 11.0 } }, { { 12.0 } }, { { 13.0 } }, { { 14.0 } } } } } } });
    double v1(15.0);
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
