  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<s0> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    s1 p0;
    std::vector<s0> p1;
    s2(s1 v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s0> p0;
    std::vector<s0> p1;
    s3(std::vector<s0> v0, std::vector<s0> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s3 p0;
    double p1;
    s4(s3 v0, double v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    std::vector<s0> p0;
    std::vector<s2> p1;
    s5(std::vector<s0> v0, std::vector<s2> v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    s5 p0;
    std::vector<s4> p1;
    s7(s5 v0, std::vector<s4> v1): p0(v0), p1(v1) { }
  };
  struct s8 {
    double p0;
    s8(double v0): p0(v0) { }
  };
  struct s13 {
    s7 p0;
    s0 p1;
    s13(s7 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s3 f52(const s3 &v0) {
    const std::vector<s0> v6 = v0.p1;
    const s0 v4 = v6[0];
    const std::vector<s0> v1 = v0.p1;
    const s0 v7 = v1[1];
    const double v5 = v4.p1;
    const s4 v9(v0, v5);
    std::vector<s0> v2 = v6;
    v2[1] = v4;
    const std::vector<std::vector<double>> v15 = v7.p0;
    v2 = v1;
    v2[0] = v4;
    const s0 v13 = v2[0];
    const std::vector<double> v8 = v15[1];
    s3 v18 = v0;
    const s0 v14 = v6[0];
    v18.p1 = v6;
    const s3 v24 = v9.p0;
    const double v27 = v8[0];
    v18.p1 = v6;
    const double v19 = v13.p1;
    v18.p1 = v6;
    const std::vector<double> v26 = v15[0];
    v18.p1 = v6;
    const double v31 = v26[0];
    v2[0] = v7;
    s4 v25 = v9;
    v2[1] = v4;
    const s0 v21 = v1[0];
    v2[1] = v4;
    s3 v32 = v0;
    s0 v33 = v4;
    v2[0] = v4;
    const s3 v40 = v9.p0;
    v18.p1 = v2;
    v2[0] = v13;
    v32.p1 = v1;
    v25.p1 = v5;
    std::vector<s0> v22 = v2;
    v22[1] = v7;
    const s0 v28 = v22[1];
    v18.p1 = v6;
    const std::vector<s0> v45 = v18.p0;
    std::vector<s0> v46 = v45;
    v22[1] = v33;
    v2 = v6;
    const std::vector<s0> v35 = v18.p0;
    const s0 v110(v15, v19);
    v25.p1 = v27;
    v2 = v6;
    const s0 v60 = v35[2];
    v22[0] = v110;
    v25.p0 = v24;
    const s3 v74 = v25.p0;
    v25.p0 = v32;
    const std::vector<s0> v36 { v33, v28, v14, v21, v7, v7 };
    const std::vector<std::vector<double>> v88 = v14.p0;
    s4 v39 = v25;
    v33.p0 = v88;
    s4 v34 = v25;
    v25 = v34;
    const std::vector<s0> v50 = v32.p1;
    v39.p0 = v74;
    v25.p0 = v18;
    const s0 v70 = v36[4];
    v39.p0 = v0;
    v25 = v39;
    v39.p0 = v40;
    s3 v68 = v74;
    v32.p0 = v46;
    v2[1] = v28;
    v46[1] = v4;
    v22[1] = v70;
    std::vector<s0> v66 = v50;
    v66[1] = v13;
    v66 = v22;
    v32.p0 = v46;
    v32.p1 = v1;
    v2[0] = v60;
    v34.p1 = v31;
    v68.p0 = v45;
    v68.p1 = v66;
    return v68;
  }
  s3 f51(const s3 &v0) {
    const std::vector<s0> v5 = v0.p1;
    const s0 v7 = v5[1];
    s3 v6 = v0;
    const s0 v3 = v5[1];
    const s0 v4 = v5[0];
    const s3 v8 = f52(v6);
    s3 v1 = v8;
    const std::vector<s0> v2 = v8.p1;
    s3 v9 = v6;
    s0 v11 = v7;
    const double v12 = v3.p1;
    std::vector<s0> v25 = v2;
    std::vector<s0> v18 = v5;
    const s0 v17 = v5[1];
    double v26 = v12;
    v9.p1 = v5;
    const s3 v31 = f52(v8);
    double v21 = v26;
    const s3 v19 = f52(v31);
    const std::vector<s0> v28 = v9.p0;
    const s3 v36 = f52(v1);
    const std::vector<s0> v47 = v19.p1;
    s3 v32 = v36;
    v9 = v36;
    const s4 v66(v36, v21);
    v1.p0 = v28;
    v6.p1 = v2;
    v18[1] = v7;
    const double v101 = v17.p1;
    v25[0] = v4;
    v11.p1 = v101;
    v9.p1 = v47;
    v32.p1 = v18;
    v18 = v25;
    const std::vector<s0> v242 = v31.p1;
    v6.p1 = v25;
    v32.p1 = v242;
    const s3 v115 = v66.p0;
    const std::vector<s0> v133 = v115.p1;
    v18[0] = v11;
    v6.p1 = v133;
    return v32;
  }
  s3 f33(const s3 &v0) {
    const s3 v2 = f52(v0);
    const std::vector<s0> v1 = v0.p0;
    const std::vector<s0> v3 = v0.p0;
    const std::vector<s0> v7 = v0.p1;
    const s0 v8 = v3[1];
    const std::vector<s0> v10 = v2.p1;
    const std::vector<s0> v12 = v0.p1;
    const s0 v9 = v1[2];
    std::vector<s0> v17 = v10;
    v17[0] = v9;
    const s0 v20 = v7[0];
    const std::vector<s0> v13 = v0.p0;
    const s3 v5 = f52(v0);
    v17[0] = v20;
    v17 = v12;
    const s3 v22 = f52(v5);
    v17[0] = v8;
    s3 v19 = v2;
    const std::vector<s0> v25 = v19.p0;
    v19.p1 = v10;
    v19 = v22;
    v19.p0 = v25;
    v17[1] = v9;
    v19.p0 = v13;
    const s3 v38 = f52(v19);
    s3 v91 = v38;
    v19 = v2;
    v19.p1 = v12;
    const s3 v73 = f52(v19);
    v19.p1 = v17;
    v19 = v73;
    return v91;
  }
  s4 f22(const s4 &v0) {
    const s3 v5 = v0.p0;
    s4 v4 = v0;
    v4.p0 = v5;
    s4 v6 = v0;
    s4 v18 = v6;
    const s3 v25 = f52(v5);
    const double v15 = v18.p1;
    v6.p1 = v15;
    s4 v21 = v0;
    const s8 v32(v15);
    const double v63 = v32.p0;
    const s3 v85 = f52(v25);
    v6 = v4;
    const double v38 = v32.p0;
    v4.p1 = v38;
    double v64 = v63;
    v6.p0 = v85;
    v4 = v21;
    v18.p1 = v64;
    return v18;
  }
  s4 f16(const s4 &v0) {
    s4 v4 = v0;
    const s4 v1 = f22(v4);
    const s3 v2 = v4.p0;
    s3 v6 = v2;
    v4.p0 = v2;
    v4.p0 = v2;
    const s4 v5 = f22(v1);
    const s3 v7 = f51(v2);
    v4.p0 = v7;
    const s4 v13 = f22(v1);
    const s3 v11 = f51(v6);
    const s3 v17 = v13.p0;
    const std::vector<s0> v10 = v17.p0;
    v6 = v7;
    const s0 v18 = v10[0];
    s3 v22 = v17;
    const std::vector<s0> v27 = v2.p1;
    const std::vector<s0> v36 = v17.p0;
    const std::vector<s0> v46 = v11.p0;
    v22.p0 = v36;
    s4 v97 = v13;
    v22.p1 = v27;
    v97.p0 = v2;
    v6.p0 = v36;
    v97 = v5;
    v4.p0 = v22;
    const double v76 = v18.p1;
    const s3 v54 = v13.p0;
    v22.p1 = v27;
    v97.p0 = v54;
    v4.p1 = v76;
    v22.p0 = v46;
    v4.p0 = v22;
    return v97;
  }
  __attribute__((noinline))
  double f0(const s13 &v0, const double &v1) {
    const s7 v7 = v0.p0;
    s7 v4 = v7;
    double v5 = v1;
    double v15 = v5;
    const std::vector<s4> v12 = v4.p1;
    const double v18 = v15 - v5;
    const s4 v17 = v12[2];
    v4.p1 = v12;
    s4 v36 = v17;
    const s4 v26 = f16(v36);
    v36.p1 = v15;
    double v52 = v1;
    v36.p1 = v18;
    v15 = v52;
    const s3 v53 = v26.p0;
    double v44 = v52;
    const s3 v79 = f52(v53);
    const s3 v189 = f33(v79);
    const s4 v99(v189, v44);
    const double v135 = v99.p1;
    return v135;
  }
  int main() {
    s13 v0({ { { { { { { 0.0 }, { 1.0 } }, 2.0 } }, { { { { { { { { 3.0 }, { 4.0 } }, 5.0 } } }, { { { { 6.0 }, { 7.0 } }, 8.0 }, { { { 9.0 }, { 10.0 } }, 11.0 }, { { { 12.0 }, { 13.0 } }, 14.0 } } }, { { { { 15.0 }, { 16.0 } }, 17.0 }, { { { 18.0 }, { 19.0 } }, 20.0 }, { { { 21.0 }, { 22.0 } }, 23.0 } } } } }, { { { { { { { 24.0 }, { 25.0 } }, 26.0 }, { { { 27.0 }, { 28.0 } }, 29.0 }, { { { 30.0 }, { 31.0 } }, 32.0 } }, { { { { 33.0 }, { 34.0 } }, 35.0 }, { { { 36.0 }, { 37.0 } }, 38.0 } } }, 39.0 }, { { { { { { 40.0 }, { 41.0 } }, 42.0 }, { { { 43.0 }, { 44.0 } }, 45.0 }, { { { 46.0 }, { 47.0 } }, 48.0 } }, { { { { 49.0 }, { 50.0 } }, 51.0 }, { { { 52.0 }, { 53.0 } }, 54.0 } } }, 55.0 }, { { { { { { 56.0 }, { 57.0 } }, 58.0 }, { { { 59.0 }, { 60.0 } }, 61.0 }, { { { 62.0 }, { 63.0 } }, 64.0 } }, { { { { 65.0 }, { 66.0 } }, 67.0 }, { { { 68.0 }, { 69.0 } }, 70.0 } } }, 71.0 } } }, { { { 72.0 }, { 73.0 } }, 74.0 } });
    double v1(75.0);
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
