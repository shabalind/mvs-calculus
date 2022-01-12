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
    std::vector<s0> p2;
    std::vector<s0> p3;
    s1(s0 v0, std::vector<s0> v1, std::vector<s0> v2, std::vector<s0> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s2 {
    s1 p0;
    s1 p1;
    s2(s1 v0, s1 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    s3(s1 v0): p0(v0) { }
  };
  struct s6 {
    s3 p0;
    s3 p1;
    s6(s3 v0, s3 v1): p0(v0), p1(v1) { }
  };
  s1 f107(const s1 &v0) {
    s1 v7 = v0;
    const std::vector<s0> v4 = v7.p2;
    const std::vector<s0> v1 = v0.p2;
    const std::vector<s0> v3 = v7.p3;
    const std::vector<s0> v2 = v0.p2;
    v7.p2 = v4;
    const s3 v5(v7);
    v7.p3 = v3;
    s1 v15 = v0;
    s3 v13 = v5;
    v7 = v15;
    v15.p2 = v1;
    v13.p0 = v15;
    const s0 v46 = v2[0];
    const s1 v41 = v13.p0;
    const s1 v26 = v13.p0;
    const s1 v50 = v13.p0;
    s1 v81 = v41;
    v7.p0 = v46;
    s3 v37 = v13;
    v13.p0 = v50;
    const s1 v52 = v37.p0;
    const s2 v105(v81, v52);
    v37.p0 = v26;
    const s1 v190 = v105.p1;
    return v190;
  }
  s3 f104(const s3 &v0, const s3 &v1, const double &v2) {
    return v0;
  }
  std::vector<s0> f94(const std::vector<s0> &v0) {
    const std::vector<std::vector<s0>> v7 { v0, v0 };
    const std::vector<s0> v8 = v7[1];
    const s0 v3 = v8[1];
    const std::vector<std::vector<double>> v12 = v3.p0;
    const std::vector<std::vector<double>> v6 = v3.p1;
    s0 v2 = v3;
    const std::vector<std::vector<double>> v17 = v3.p0;
    const std::vector<s0> v1 = v7[0];
    const std::vector<s0> v11 = v7[0];
    const std::vector<std::vector<double>> v25 = v3.p0;
    const std::vector<std::vector<double>> v39 = v2.p0;
    const std::vector<double> v20 = v12[0];
    v2.p0 = v17;
    const std::vector<std::vector<double>> v23 = v3.p1;
    v2.p1 = v23;
    const s0 v27 = v11[0];
    std::vector<std::vector<double>> v29 = v6;
    v2.p1 = v6;
    std::vector<s0> v33 = v1;
    const std::vector<std::vector<double>> v45 = v2.p1;
    v33[0] = v2;
    v2.p1 = v29;
    v2.p1 = v6;
    v33[0] = v27;
    const std::vector<double> v46 = v23[0];
    v2.p1 = v29;
    v29[0] = v20;
    const s0 v98 = v0[1];
    const std::vector<std::vector<double>> v49 = v3.p0;
    const std::vector<std::vector<double>> v73 = v3.p1;
    std::vector<std::vector<double>> v69 = v39;
    v2.p1 = v73;
    v2.p0 = v69;
    const std::vector<std::vector<double>> v83 = v98.p1;
    v2 = v27;
    v29[0] = v46;
    const s0 v55(v12, v83);
    v2.p1 = v6;
    v2.p0 = v25;
    v2.p0 = v49;
    v2.p1 = v83;
    const std::vector<std::vector<double>> v67 = v55.p1;
    v2.p1 = v45;
    v2.p1 = v67;
    v2.p1 = v29;
    v2.p1 = v45;
    return v33;
  }
  s3 f88(const s3 &v0) {
    s3 v4 = v0;
    const s6 v5(v0, v4);
    const std::vector<s3> v6 { v4, v4, v0, v0, v4, v4 };
    const s1 v8 = v0.p0;
    s3 v1 = v0;
    s6 v9 = v5;
    s3 v21 = v0;
    const s1 v13 = v0.p0;
    const s1 v15 = v1.p0;
    const std::vector<s0> v7 = v13.p1;
    const std::vector<s0> v17 = f94(v7);
    v21.p0 = v13;
    const s0 v16 = v17[1];
    v21.p0 = v8;
    std::vector<s3> v38 = v6;
    const s3 v30 = v38[2];
    v38[2] = v4;
    v21.p0 = v15;
    const s3 v43 = v9.p0;
    const std::vector<std::vector<double>> v35 = v16.p1;
    v9.p0 = v43;
    const std::vector<double> v56 = v35[0];
    const double v77 = v56[0];
    const std::vector<double> v102 = v35[0];
    const s3 v45 = v9.p1;
    v1.p0 = v13;
    const s3 v73 = f104(v45, v21, v77);
    const s3 v78 = f104(v73, v30, v77);
    const double v66 = v102[0];
    const s3 v128 = f104(v78, v1, v66);
    v21 = v78;
    v38[3] = v45;
    return v128;
  }
  s0 f87(const s3 &v0, const s0 &v1) {
    s3 v4 = v0;
    const s1 v2 = v4.p0;
    s1 v5 = v2;
    const s1 v12 = v4.p0;
    v4.p0 = v12;
    s1 v3 = v12;
    const std::vector<s0> v6 = v3.p1;
    const std::vector<s0> v9 = v12.p2;
    const std::vector<s0> v8 = f94(v6);
    const s1 v16 = f107(v2);
    const s1 v36 = f107(v16);
    const std::vector<s0> v13 = v36.p1;
    std::vector<s0> v18 = v8;
    std::vector<s0> v19 = v9;
    const s0 v35 = v19[1];
    const s0 v33 = v13[0];
    v19[0] = v33;
    const s0 v31 = v8[1];
    v19[1] = v33;
    v3.p2 = v6;
    v19[1] = v31;
    v19[1] = v1;
    const std::vector<s0> v63 = f94(v6);
    v4.p0 = v5;
    std::vector<s0> v71 = v18;
    v3.p1 = v71;
    const std::vector<s0> v116 = f94(v63);
    const s0 v86 = v116[0];
    v4.p0 = v3;
    v4.p0 = v36;
    v3.p0 = v35;
    return v86;
  }
  s0 f66(const s0 &v0) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v1 = v2.p1;
    std::vector<std::vector<double>> v5 = v1;
    const std::vector<std::vector<double>> v3 = v0.p1;
    v2.p1 = v5;
    const std::vector<std::vector<double>> v6 = v2.p0;
    v5 = v3;
    std::vector<std::vector<double>> v7 = v6;
    const std::vector<double> v4 = v6[0];
    const std::vector<std::vector<double>> v9 = v0.p1;
    std::vector<std::vector<double>> v8 = v6;
    const std::vector<std::vector<double>> v10 = v2.p1;
    v5[0] = v4;
    const std::vector<double> v12 = v8[2];
    const std::vector<double> v16 = v1[0];
    s0 v13 = v0;
    const std::vector<std::vector<std::vector<double>>> v25 { v5, v10 };
    v8 = v7;
    v7[1] = v16;
    v13.p0 = v6;
    const std::vector<std::vector<double>> v26 = v0.p0;
    v5[0] = v4;
    v5[0] = v12;
    const std::vector<std::vector<double>> v15 = v25[0];
    v8 = v26;
    v7[1] = v4;
    const std::vector<double> v28 = v26[0];
    v2.p1 = v9;
    v7[0] = v16;
    v13.p0 = v6;
    v5[0] = v28;
    v13.p0 = v26;
    v13.p1 = v15;
    return v13;
  }
  s1 f52(const s1 &v0) {
    const s1 v1 = f107(v0);
    const s0 v2 = v1.p0;
    s1 v24 = v0;
    const s0 v26 = f66(v2);
    v24.p0 = v26;
    return v24;
  }
  s1 f43(const s1 &v0, const s3 &v1) {
    const s1 v3 = v1.p0;
    s1 v6 = v3;
    const s1 v8 = f52(v6);
    const s1 v13 = v1.p0;
    const std::vector<s0> v27 = v8.p2;
    std::vector<s0> v18 = v27;
    s1 v21 = v13;
    const s0 v15 = v18[0];
    v6.p2 = v27;
    const std::vector<s0> v25 { v15, v15, v15, v15, v15, v15, v15 };
    const s0 v24 = v25[6];
    const s0 v39 = v25[6];
    s1 v50 = v21;
    v18[1] = v39;
    v50.p2 = v18;
    const std::vector<s0> v57 = v6.p2;
    v21.p1 = v18;
    v50.p1 = v57;
    v21.p0 = v24;
    return v50;
  }
  s3 f37(const s3 &v0, const s0 &v1) {
    const s0 v8 = f66(v1);
    const std::vector<s3> v6 { v0, v0, v0, v0, v0 };
    const s3 v2 = v6[2];
    const std::vector<std::vector<double>> v11 = v8.p1;
    const std::vector<double> v28 = v11[0];
    const s3 v34 = v6[1];
    const double v39 = v28[0];
    const s3 v61 = f88(v2);
    const s3 v58 = f104(v61, v34, v39);
    return v58;
  }
  s1 f29(const s3 &v0, const s1 &v1) {
    s1 v2 = v1;
    const std::vector<s0> v6 = v1.p2;
    const s0 v5 = v1.p0;
    v2.p1 = v6;
    v2.p0 = v5;
    const s0 v4 = f87(v0, v5);
    const std::vector<std::vector<double>> v7 = v4.p1;
    v2.p2 = v6;
    const std::vector<s0> v11 = v2.p3;
    const s3 v8 = f37(v0, v4);
    s3 v15 = v0;
    const std::vector<double> v9 = v7[0];
    const s3 v13 = f88(v8);
    const s0 v12 = v11[0];
    const double v16 = v9[0];
    v2.p3 = v11;
    const std::vector<s0> v14 = f94(v6);
    v15.p0 = v2;
    const s3 v39 = f104(v0, v15, v16);
    v2.p1 = v6;
    s1 v27 = v2;
    std::vector<s0> v21 = v11;
    s3 v20 = v13;
    const s0 v23 = v2.p0;
    const s0 v51 = v21[0];
    const s0 v37 = v14[1];
    const s3 v31 = f37(v20, v51);
    const std::vector<s0> v25 = v1.p2;
    v21[0] = v12;
    const std::vector<double> v47 = v7[0];
    v20.p0 = v1;
    const double v50 = v47[0];
    v2.p2 = v25;
    const s1 v55 = v20.p0;
    v20.p0 = v27;
    const s1 v65 = f52(v2);
    v20.p0 = v27;
    const s1 v104 = v8.p0;
    const s1 v78 = v31.p0;
    v15.p0 = v55;
    v21[0] = v37;
    const std::vector<s1> v80 { v65, v2, v78, v1, v55, v104 };
    v20.p0 = v2;
    const s1 v86 = v80[0];
    v21[0] = v23;
    const s3 v48 = f104(v8, v39, v50);
    v20.p0 = v55;
    v20 = v48;
    return v86;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const s3 &v1, const double &v2) {
    const s3 v3 = v0[1];
    const s1 v4 = v1.p0;
    const s1 v9 = f52(v4);
    const s1 v30 = f29(v3, v9);
    const s1 v10 = f43(v9, v3);
    const s1 v13 = v1.p0;
    s1 v39 = v13;
    const s3 v50 = v0[0];
    const s1 v26 = f43(v10, v50);
    const std::vector<s0> v19 = v39.p2;
    const s0 v28 = v26.p0;
    const s1 v33 = v50.p0;
    v39.p0 = v28;
    const s0 v35 = v19[0];
    const s0 v48 = v30.p0;
    v39.p0 = v48;
    const std::vector<std::vector<double>> v60 = v35.p1;
    const std::vector<double> v64 = v60[0];
    const std::vector<s0> v89 = v33.p3;
    v39.p3 = v89;
    const std::vector<s0> v43 = v26.p1;
    const double v68 = v64[0];
    const s0 v57 = v43[1];
    v39.p0 = v57;
    return v68;
  }
  int main() {
    std::vector<s3> v0({ { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 } } }, { { { { 4.0 }, { 5.0 }, { 6.0 } }, { { 7.0 } } }, { { { 8.0 }, { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 } } }, { { { 16.0 }, { 17.0 }, { 18.0 } }, { { 19.0 } } } }, { { { { 20.0 }, { 21.0 }, { 22.0 } }, { { 23.0 } } } } } }, { { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 } } }, { { { { 28.0 }, { 29.0 }, { 30.0 } }, { { 31.0 } } }, { { { 32.0 }, { 33.0 }, { 34.0 } }, { { 35.0 } } } }, { { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 } } }, { { { 40.0 }, { 41.0 }, { 42.0 } }, { { 43.0 } } } }, { { { { 44.0 }, { 45.0 }, { 46.0 } }, { { 47.0 } } } } } } });
    s3 v1({ { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 } } }, { { { { 52.0 }, { 53.0 }, { 54.0 } }, { { 55.0 } } }, { { { 56.0 }, { 57.0 }, { 58.0 } }, { { 59.0 } } } }, { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 } } }, { { { 64.0 }, { 65.0 }, { 66.0 } }, { { 67.0 } } } }, { { { { 68.0 }, { 69.0 }, { 70.0 } }, { { 71.0 } } } } } });
    double v2(72.0);
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
