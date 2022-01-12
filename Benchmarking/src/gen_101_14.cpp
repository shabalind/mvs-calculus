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
  struct s3 {
    std::vector<s0> p0;
    s0 p1;
    s3(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s3 f115(const s3 &v0) {
    const s0 v6 = v0.p1;
    s3 v5 = v0;
    const std::vector<s0> v3 = v5.p0;
    v5.p1 = v6;
    const s0 v2 = v3[2];
    s0 v7 = v2;
    const std::vector<std::vector<double>> v4 = v7.p1;
    const s0 v14 = v3[0];
    const std::vector<s0> v18 = v0.p0;
    s0 v13 = v7;
    v7.p1 = v4;
    s3 v10 = v5;
    s3 v12 = v10;
    v7.p1 = v4;
    const std::vector<std::vector<double>> v27 = v7.p1;
    v7.p1 = v27;
    s3 v21 = v12;
    const std::vector<s0> v24 = v21.p0;
    v5.p0 = v18;
    s0 v38 = v13;
    v12.p1 = v38;
    v12.p0 = v24;
    const std::vector<std::vector<double>> v51 = v14.p0;
    v12.p1 = v38;
    s3 v54 = v12;
    v21.p0 = v24;
    s3 v48 = v54;
    v38 = v13;
    v38.p0 = v51;
    return v48;
  }
  s0 f113(const s0 &v0) {
    s0 v3 = v0;
    v3 = v0;
    const std::vector<std::vector<double>> v12 = v3.p1;
    s0 v9 = v0;
    v9.p1 = v12;
    return v9;
  }
  s0 f100(const s0 &v0) {
    const std::vector<std::vector<double>> v3 = v0.p0;
    std::vector<std::vector<double>> v5 = v3;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const s0 v4 = f113(v0);
    const std::vector<double> v15 = v9[2];
    v5[0] = v15;
    const s0 v20 = f113(v0);
    const s0 v22 = f113(v4);
    const s1 v11(v0, v22);
    const s0 v24 = f113(v4);
    s1 v28 = v11;
    v28.p1 = v22;
    const s0 v17 = f113(v4);
    v28.p1 = v20;
    v28.p1 = v24;
    const std::vector<std::vector<double>> v27 = v20.p1;
    const std::vector<double> v92 = v27[0];
    v5[0] = v92;
    v28.p0 = v24;
    const s0 v86 = f113(v0);
    const s0 v38 = f113(v17);
    v28.p1 = v38;
    v28.p0 = v22;
    const std::vector<std::vector<double>> v74 = v20.p0;
    const s0 v77 = v28.p0;
    const s0 v121 = f113(v77);
    const std::vector<std::vector<std::vector<double>>> v104 { v5, v74 };
    v28.p0 = v86;
    const std::vector<std::vector<double>> v185 = v104[1];
    s0 v106 = v121;
    v106.p0 = v185;
    return v106;
  }
  s3 f96(const s3 &v0) {
    const s3 v7 = f115(v0);
    const s3 v29 = f115(v7);
    s3 v18 = v29;
    return v18;
  }
  s0 f61(const s0 &v0) {
    s0 v3 = v0;
    const std::vector<std::vector<double>> v6 = v0.p0;
    v3.p0 = v6;
    const std::vector<std::vector<double>> v4 = v0.p1;
    const std::vector<double> v1 = v4[0];
    const s0 v12 = f113(v3);
    std::vector<double> v7 = v1;
    std::vector<std::vector<double>> v23 = v6;
    v23[1] = v7;
    v23[1] = v1;
    v23[1] = v1;
    s0 v35 = v12;
    v23[0] = v1;
    v35.p0 = v23;
    const std::vector<std::vector<double>> v19 = v0.p1;
    const std::vector<double> v49 = v19[0];
    v23[2] = v49;
    return v35;
  }
  s3 f42(const s3 &v0) {
    const s3 v2 = f115(v0);
    const s3 v4 = f115(v2);
    const s3 v8 = f96(v0);
    const s0 v5 = v8.p1;
    const s1 v6(v5, v5);
    const std::vector<s0> v1 = v8.p0;
    const s3 v11 = f115(v2);
    const s0 v25 = v1[2];
    const s0 v10 = f113(v5);
    const s0 v3 = f61(v25);
    const s0 v18 = f100(v25);
    const s0 v19 = v6.p1;
    s3 v12 = v4;
    v12.p1 = v18;
    const std::vector<s0> v13 = v2.p0;
    const std::vector<s0> v21 { v19, v10, v19 };
    const s3 v59 = f115(v0);
    s3 v48 = v11;
    v12.p0 = v21;
    const s3 v32(v13, v18);
    const std::vector<s3> v57 { v32, v2, v48, v32, v0, v59, v12 };
    v48.p0 = v1;
    s3 v61 = v0;
    const s3 v40 = v57[3];
    const s3 v70 = v57[4];
    const std::vector<s3> v62 { v40, v70, v32, v11, v61, v61 };
    v48.p0 = v13;
    const s3 v215 = v62[0];
    s3 v124 = v215;
    v48.p1 = v3;
    v48.p0 = v13;
    return v124;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const s3 &v1, const double &v2) {
    const s0 v5 = f100(v0);
    s3 v7 = v1;
    const s3 v4 = f96(v7);
    const s0 v8 = v4.p1;
    v7.p1 = v8;
    const s3 v11 = f42(v4);
    const std::vector<s0> v12 { v0, v5, v5 };
    s3 v14 = v1;
    v7.p1 = v8;
    const s0 v49 = v14.p1;
    const std::vector<std::vector<double>> v21 = v0.p0;
    const s0 v22 = v11.p1;
    const s0 v23 = f113(v22);
    s0 v53 = v22;
    const std::vector<std::vector<double>> v41 = v23.p1;
    v7.p1 = v49;
    const std::vector<double> v33 = v41[0];
    v14.p0 = v12;
    const double v34 = v33[0];
    v53.p0 = v21;
    v7.p1 = v53;
    const s0 v64 = v4.p1;
    v7.p1 = v64;
    return v34;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    s3 v1({ { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } }, { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } });
    double v2(20.0);
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
