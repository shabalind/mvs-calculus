  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f55(const s0 &v0) {
    s0 v1 = v0;
    const std::vector<std::vector<double>> v2 = v1.p1;
    v1.p1 = v2;
    const std::vector<std::vector<double>> v8 = v1.p0;
    const std::vector<std::vector<double>> v4 = v1.p1;
    const std::vector<double> v21 = v4[0];
    const std::vector<std::vector<double>> v9 = v0.p0;
    v1.p0 = v8;
    const std::vector<double> v15 = v8[2];
    std::vector<std::vector<double>> v23 = v9;
    v23[0] = v21;
    const std::vector<std::vector<double>> v24 = v1.p1;
    s0 v32 = v0;
    const std::vector<std::vector<double>> v20 = v1.p0;
    const std::vector<std::vector<std::vector<double>>> v25 { v8, v20, v20, v9, v23 };
    v32.p0 = v23;
    const std::vector<std::vector<double>> v18 = v1.p0;
    v32.p1 = v2;
    const std::vector<std::vector<double>> v28 = v1.p0;
    v1.p1 = v4;
    s0 v27 = v32;
    v23[0] = v15;
    const std::vector<std::vector<double>> v34 = v1.p1;
    const std::vector<std::vector<double>> v37 = v25[4];
    v27.p1 = v24;
    std::vector<std::vector<std::vector<double>>> v48 = v25;
    v48[2] = v18;
    v23 = v20;
    v1.p0 = v28;
    v27.p1 = v34;
    const std::vector<std::vector<double>> v109 = v48[0];
    v1.p0 = v109;
    v32.p0 = v37;
    v1 = v27;
    s0 v76 = v0;
    v48[0] = v23;
    v76.p0 = v18;
    return v76;
  }
  s0 f37(const s0 &v0) {
    s0 v7 = v0;
    const std::vector<std::vector<double>> v4 = v7.p1;
    std::vector<std::vector<double>> v1 = v4;
    const std::vector<double> v2 = v1[0];
    const std::vector<std::vector<double>> v3 = v7.p0;
    const std::vector<std::vector<double>> v6 = v7.p0;
    const std::vector<double> v5 = v6[1];
    std::vector<std::vector<double>> v18 = v4;
    s0 v20 = v7;
    v18[0] = v5;
    v7.p1 = v4;
    const s0 v22(v3, v18);
    const std::vector<std::vector<double>> v36 = v20.p0;
    s0 v19 = v0;
    const std::vector<std::vector<double>> v39 = v19.p1;
    const std::vector<double> v24 = v39[0];
    std::vector<std::vector<double>> v52 = v36;
    v19.p0 = v52;
    v18[0] = v2;
    v7.p1 = v1;
    v1[0] = v24;
    return v22;
  }
  s0 f31(const s0 &v0, const s0 &v1) {
    const std::vector<s0> v6 { v0, v1, v0, v0, v1 };
    std::vector<s0> v5 = v6;
    const s0 v2 = v5[2];
    const std::vector<std::vector<double>> v10 = v0.p0;
    const std::vector<std::vector<double>> v29 = v2.p1;
    const s0 v23(v10, v29);
    return v23;
  }
  s0 f21(const s0 &v0) {
    const s0 v5 = f55(v0);
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s0 v3 = f55(v5);
    const std::vector<std::vector<double>> v7 = v5.p1;
    const s0 v8(v6, v7);
    const s0 v9 = f37(v3);
    const s0 v25 = f31(v3, v9);
    const s0 v18 = f55(v25);
    const std::vector<s0> v15 { v5, v8, v8, v0, v3, v8, v18 };
    const s0 v53 = v15[4];
    const s0 v37 = f37(v53);
    return v37;
  }
  s0 f5(const s0 &v0) {
    s0 v8 = v0;
    s0 v16 = v8;
    const s0 v12 = f21(v16);
    const std::vector<s0> v19 { v12 };
    const s0 v15 = v19[0];
    return v15;
  }
  s0 f2(const s0 &v0) {
    s0 v3 = v0;
    s0 v7 = v3;
    s0 v1 = v7;
    s0 v4 = v0;
    const std::vector<s0> v6 { v7, v4, v1, v7, v3, v7 };
    const s0 v5 = v6[2];
    const s0 v9 = v6[5];
    const std::vector<std::vector<double>> v13 = v4.p1;
    s0 v10 = v3;
    const s0 v15 = f55(v4);
    v10.p1 = v13;
    const std::vector<double> v8 = v13[0];
    const std::vector<std::vector<double>> v11 = v5.p1;
    const s0 v19 = v6[0];
    const std::vector<std::vector<double>> v12 = v4.p0;
    v4.p0 = v12;
    const std::vector<double> v24 = v11[0];
    const s0 v18 = f55(v10);
    std::vector<std::vector<double>> v16 = v12;
    std::vector<double> v14 = v24;
    v16[2] = v8;
    const s0 v17 = v6[3];
    v10.p1 = v13;
    const std::vector<std::vector<double>> v22 = v10.p1;
    v16[1] = v8;
    const double v21 = v14[0];
    s0 v40 = v5;
    const s0 v25 = f21(v40);
    v16[2] = v14;
    const std::vector<std::vector<double>> v47 = v18.p1;
    const std::vector<double> v35 = v22[0];
    std::vector<std::vector<double>> v45 = v47;
    v40.p0 = v16;
    const s0 v20 = f55(v19);
    const s0 v29 = f31(v5, v1);
    const std::vector<std::vector<double>> v37 = v0.p1;
    const std::vector<std::vector<double>> v89 = v10.p0;
    v45[0] = v35;
    v45[0] = v35;
    v45[0] = v35;
    const s0 v34 = f37(v1);
    const s0 v55 = f5(v19);
    s0 v79 = v55;
    double v57 = v21;
    v7.p0 = v89;
    v10.p1 = v37;
    v79 = v34;
    const std::vector<std::vector<double>> v62 = v17.p0;
    v40.p1 = v45;
    const std::vector<std::vector<double>> v56 = v25.p1;
    const std::vector<std::vector<double>> v52 = v15.p0;
    std::vector<std::vector<double>> v82 = v45;
    std::vector<std::vector<double>> v119 = v56;
    const s0 v59 = f31(v20, v9);
    const double v53 = v21 / v57;
    v45 = v119;
    const s0 v138 = f55(v79);
    const s0 v115 = f31(v138, v59);
    v14[0] = v57;
    const std::vector<double> v66 { v57, v21, v21, v53, v53 };
    const std::vector<std::vector<double>> v86 = v29.p0;
    v79.p1 = v11;
    v4.p1 = v22;
    v40.p0 = v89;
    v40.p0 = v86;
    v1.p1 = v22;
    const double v73 = v66[4];
    v119[0] = v8;
    v3.p0 = v62;
    v7.p0 = v52;
    v14[0] = v73;
    v7.p1 = v82;
    return v115;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v3 = v0.p1;
    const s0 v9 = f5(v0);
    const s0 v5 = f37(v0);
    s0 v8 = v5;
    const std::vector<double> v6 = v3[0];
    const s0 v10 = f55(v9);
    v8.p1 = v3;
    std::vector<double> v15 = v6;
    std::vector<double> v22 = v15;
    v8.p1 = v3;
    const double v29 = v22[0];
    const std::vector<std::vector<double>> v27 = v8.p0;
    const s0 v38 = f2(v10);
    const std::vector<double> v52 = v27[2];
    const std::vector<std::vector<double>> v25 = v38.p0;
    v8.p0 = v25;
    v22[0] = v1;
    const double v67 = v52[0];
    const double v73 = v29 / v67;
    v22[0] = v67;
    return v73;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } });
    double v1(4.0);
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
