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
    s1 p0;
    std::vector<std::vector<s1>> p1;
    s2(s1 v0, std::vector<std::vector<s1>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s2 p0;
    std::vector<std::vector<s0>> p1;
    std::vector<s1> p2;
    s3(s2 v0, std::vector<std::vector<s0>> v1, std::vector<s1> v2): p0(v0), p1(v1), p2(v2) { }
  };
  s1 f71(const s1 &v0) {
    const s0 v4 = v0.p1;
    s0 v2 = v4;
    s1 v1 = v0;
    v1.p0 = v2;
    s1 v7 = v1;
    s0 v3 = v2;
    const std::vector<std::vector<double>> v6 = v4.p1;
    v2.p1 = v6;
    v2 = v3;
    const s0 v18 = v7.p1;
    v1.p1 = v18;
    v3.p1 = v6;
    const std::vector<std::vector<double>> v35 = v2.p0;
    std::vector<std::vector<double>> v26 = v35;
    v2.p0 = v26;
    v2.p0 = v35;
    return v7;
  }
  s1 f70(const s1 &v0) {
    const std::vector<s1> v5 { v0, v0, v0, v0, v0 };
    const s1 v7 = f71(v0);
    std::vector<s1> v8 = v5;
    std::vector<s1> v4 = v5;
    const s1 v6 = f71(v7);
    const s0 v1 = v6.p1;
    v8 = v4;
    const s1 v12 = v8[0];
    s1 v11 = v12;
    v11.p1 = v1;
    const s1 v17 = v4[4];
    const std::vector<std::vector<double>> v9 = v1.p1;
    v11.p1 = v1;
    std::vector<std::vector<double>> v10 = v9;
    s0 v16 = v1;
    std::vector<std::vector<double>> v27 = v9;
    v27 = v9;
    const std::vector<double> v22 = v27[0];
    v11.p0 = v1;
    v16.p1 = v10;
    v10[2] = v22;
    const s1 v13 = f71(v17);
    std::vector<std::vector<double>> v35 = v10;
    v4[1] = v13;
    s0 v20 = v1;
    const std::vector<std::vector<double>> v34 = v20.p0;
    std::vector<std::vector<double>> v25 = v35;
    const std::vector<double> v41 = v34[0];
    const std::vector<double> v31 = v34[0];
    std::vector<std::vector<double>> v37 = v9;
    v16.p1 = v37;
    v25[2] = v22;
    std::vector<double> v38 = v41;
    v16.p1 = v10;
    v11.p0 = v1;
    const s1 v57 = f71(v11);
    v27[0] = v38;
    v11.p0 = v20;
    const std::vector<std::vector<double>> v64 = v16.p0;
    v35[1] = v31;
    v16.p0 = v34;
    v10[2] = v38;
    v10[2] = v31;
    const s0 v62(v34, v9);
    v37 = v25;
    v20.p0 = v34;
    const std::vector<double> v77 = v64[1];
    v16 = v62;
    v20.p0 = v64;
    const std::vector<std::vector<double>> v54 = v20.p0;
    v27[0] = v77;
    v35[2] = v31;
    std::vector<std::vector<double>> v162 = v54;
    v20.p0 = v162;
    v35[1] = v31;
    return v57;
  }
  s1 f65(const s1 &v0) {
    const s1 v2 = f70(v0);
    const s0 v4 = v2.p1;
    const s0 v10 = v0.p1;
    s0 v8 = v10;
    const std::vector<std::vector<double>> v15 = v8.p0;
    std::vector<std::vector<double>> v13 = v15;
    const s1 v9 = f70(v0);
    const std::vector<std::vector<double>> v18 = v4.p1;
    const std::vector<std::vector<double>> v11 = v10.p1;
    const s0 v29 = v2.p1;
    v8.p1 = v18;
    std::vector<std::vector<double>> v21 = v13;
    const std::vector<double> v22 = v21[1];
    v13[1] = v22;
    v13[1] = v22;
    const std::vector<double> v27 = v13[0];
    const s0 v32 = v9.p1;
    s1 v20 = v9;
    const s0 v37 = v0.p1;
    const s0 v106 = v2.p1;
    v13[0] = v22;
    const s0 v113(v21, v11);
    const std::vector<std::vector<double>> v159 = v106.p1;
    v21[1] = v27;
    const s0 v119(v15, v159);
    const s1 v66 = f71(v20);
    const std::vector<s0> v110 { v119, v32, v37, v29 };
    std::vector<s0> v253 = v110;
    const s0 v122 = v66.p0;
    v253[0] = v122;
    const s0 v157 = v253[2];
    const s1 v142(v113, v157);
    return v142;
  }
  s1 f50(const s1 &v0) {
    const s0 v1 = v0.p1;
    const s0 v4 = v0.p1;
    const std::vector<s0> v2 { v1 };
    const s0 v9 = v2[0];
    s0 v8 = v9;
    s0 v36 = v4;
    const s1 v33(v36, v8);
    return v33;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v5 = v1[1];
    const std::vector<std::vector<double>> v4 = v5.p1;
    const s1 v8(v5, v5);
    const s1 v11 = f50(v8);
    const s1 v9 = f65(v11);
    const s0 v13 = v9.p1;
    const std::vector<double> v17 = v4[0];
    std::vector<double> v30 = v17;
    double v38 = v2;
    const std::vector<std::vector<double>> v24 = v13.p0;
    double v28 = v38;
    const std::vector<double> v41 = v24[1];
    std::vector<double> v116 = v30;
    v116 = v41;
    const double v139 = v2 + v28;
    const double v112 = v116[0];
    v30[0] = v139;
    return v112;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { 0.0 }, { 1.0 } }, { { 2.0 }, { 3.0 }, { 4.0 } } }, { { { 5.0 }, { 6.0 } }, { { 7.0 }, { 8.0 }, { 9.0 } } } }, { { { { { { 10.0 }, { 11.0 } }, { { 12.0 }, { 13.0 }, { 14.0 } } }, { { { 15.0 }, { 16.0 } }, { { 17.0 }, { 18.0 }, { 19.0 } } } } } } }, { { { { { 20.0 }, { 21.0 } }, { { 22.0 }, { 23.0 }, { 24.0 } } } }, { { { { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } }, { { { { 30.0 }, { 31.0 } }, { { 32.0 }, { 33.0 }, { 34.0 } } } } }, { { { { { 35.0 }, { 36.0 } }, { { 37.0 }, { 38.0 }, { 39.0 } } }, { { { 40.0 }, { 41.0 } }, { { 42.0 }, { 43.0 }, { 44.0 } } } }, { { { { 45.0 }, { 46.0 } }, { { 47.0 }, { 48.0 }, { 49.0 } } }, { { { 50.0 }, { 51.0 } }, { { 52.0 }, { 53.0 }, { 54.0 } } } } } } });
    std::vector<s0> v1({ { { { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } }, { { { 60.0 }, { 61.0 } }, { { 62.0 }, { 63.0 }, { 64.0 } } } });
    double v2(65.0);
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
