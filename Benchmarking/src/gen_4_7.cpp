  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    s0 p1;
    s3(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  s3 f22(const s3 &v0) {
    s3 v5 = v0;
    s3 v7 = v5;
    const std::vector<s3> v4 { v5, v7 };
    const s0 v3 = v5.p1;
    const std::vector<s0> v8 = v7.p0;
    const s0 v12 = v8[1];
    const s3 v14(v8, v3);
    v5.p0 = v8;
    v7.p1 = v12;
    const s3 v13 = v4[0];
    const s0 v15 = v13.p1;
    v5.p1 = v15;
    return v14;
  }
  std::vector<s0> f9(const std::vector<s0> &v0) {
    const s0 v5 = v0[2];
    const std::vector<std::vector<double>> v1 = v5.p0;
    const s0 v4 = v0[2];
    const std::vector<double> v2 = v5.p1;
    s0 v13 = v5;
    const s0 v11 = v0[0];
    std::vector<s0> v17 = v0;
    v13.p0 = v1;
    const std::vector<double> v10 = v11.p1;
    v13.p0 = v1;
    v17[2] = v13;
    v13.p1 = v10;
    v13.p1 = v2;
    const s3 v56(v17, v4);
    const s3 v34 = f22(v56);
    const s3 v49 = f22(v34);
    const s3 v93 = f22(v49);
    const s3 v59 = f22(v93);
    v17 = v0;
    const s3 v63 = f22(v59);
    const s3 v123 = f22(v63);
    const std::vector<s0> v111 = v123.p0;
    return v111;
  }
  double f3(const double &v0) {
    double v6 = v0;
    double v7 = v0;
    double v3 = v6;
    double v5 = v6;
    double v10 = v5;
    double v12 = v10;
    v12 = v3;
    v12 = v7;
    return v12;
  }
  __attribute__((noinline))
  double f0(const s3 &v0, const double &v1) {
    s3 v7 = v0;
    const double v6 = f3(v1);
    const s0 v3 = v7.p1;
    v7.p1 = v3;
    v7.p1 = v3;
    v7.p1 = v3;
    const s3 v20 = f22(v0);
    s0 v11 = v3;
    const std::vector<double> v12 = v3.p1;
    const std::vector<std::vector<double>> v14 = v3.p0;
    const std::vector<double> v17 = v14[1];
    std::vector<double> v32 = v17;
    s0 v22 = v3;
    s0 v21 = v3;
    const s0 v35 = v20.p1;
    std::vector<std::vector<double>> v25 = v14;
    s0 v28 = v35;
    const std::vector<s0> v27 = v7.p0;
    v28.p0 = v14;
    std::vector<std::vector<double>> v75 = v14;
    const s0 v52 = v27[2];
    std::vector<double> v43 = v32;
    std::vector<std::vector<double>> v61 = v75;
    const std::vector<std::vector<double>> v44 = v11.p0;
    v75 = v44;
    s0 v60 = v21;
    const std::vector<s0> v81 = f9(v27);
    const s0 v69 = v27[1];
    v75[0] = v43;
    v32[0] = v6;
    v7.p1 = v22;
    v25[2] = v17;
    v22.p1 = v12;
    s0 v49 = v28;
    v21.p0 = v25;
    const std::vector<double> v70 = v11.p1;
    const std::vector<double> v53 = v69.p1;
    s0 v48 = v52;
    const s0 v110 = v81[1];
    const std::vector<double> v56 = v110.p1;
    v7.p1 = v60;
    v21.p1 = v56;
    v28.p0 = v14;
    std::vector<double> v68 = v17;
    v49.p1 = v70;
    const std::vector<double> v100 = v49.p1;
    v28.p0 = v25;
    v75[0] = v68;
    v21.p1 = v100;
    v75[2] = v17;
    const double v74 = v100[0];
    v25[0] = v32;
    v28.p0 = v61;
    v60 = v69;
    v28.p1 = v53;
    v7.p1 = v48;
    return v74;
  }
  int main() {
    s3 v0({ { { { { 0.0 }, { 1.0 }, { 2.0 } }, { 3.0, 4.0 } }, { { { 5.0 }, { 6.0 }, { 7.0 } }, { 8.0, 9.0 } }, { { { 10.0 }, { 11.0 }, { 12.0 } }, { 13.0, 14.0 } } }, { { { 15.0 }, { 16.0 }, { 17.0 } }, { 18.0, 19.0 } } });
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
