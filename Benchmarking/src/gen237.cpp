  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<std::vector<s0>> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<std::vector<s0>> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s2 {
    std::vector<s0> p0;
    s0 p1;
    s2(std::vector<s0> v0, s0 v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    s1 p0;
    std::vector<double> p1;
    s3(s1 v0, std::vector<double> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    std::vector<s0> p0;
    std::vector<s3> p1;
    s4(std::vector<s0> v0, std::vector<s3> v1): p0(v0), p1(v1) { }
  };
  struct s5 {
    s3 p0;
    s2 p1;
    s5(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s6 {
    s3 p0;
    s2 p1;
    s6(s3 v0, s2 v1): p0(v0), p1(v1) { }
  };
  struct s7 {
    std::vector<s6> p0;
    std::vector<std::vector<s3>> p1;
    s7(std::vector<s6> v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  struct s10 {
    s4 p0;
    std::vector<s1> p1;
    s10(s4 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  std::vector<s3> f12(const std::vector<s3> &v0) {
    std::vector<s3> v2 = v0;
    return v2;
  }
  s4 f11(const s4 &v0, const s2 &v1) {
    const std::vector<s0> v4 = v0.p0;
    const s0 v11 = v4[0];
    const s0 v7 = v4[0];
    const s0 v15 = v4[0];
    std::vector<s0> v13 = v4;
    v13 = v4;
    std::vector<s0> v29 = v4;
    const std::vector<s3> v16 = v0.p1;
    const std::vector<s0> v34 = v1.p0;
    v13[1] = v7;
    v13[0] = v11;
    const s0 v58 = v34[0];
    v29[1] = v58;
    v29[0] = v15;
    const s0 v78 = v34[0];
    v29[1] = v78;
    const std::vector<s3> v41 = f12(v16);
    s4 v82 = v0;
    s0 v62 = v58;
    const s4 v59(v29, v41);
    const std::vector<std::vector<double>> v100 = v62.p1;
    v29[1] = v62;
    const std::vector<s0> v123 = v59.p0;
    v82.p0 = v13;
    v82.p0 = v123;
    v62.p1 = v100;
    return v82;
  }
  s3 f7(const s3 &v0) {
    const std::vector<double> v5 = v0.p1;
    const std::vector<double> v1 = v0.p1;
    s3 v3 = v0;
    const std::vector<double> v7 = v3.p1;
    const std::vector<double> v8 = v3.p1;
    const s1 v10 = v0.p0;
    s1 v9 = v10;
    const std::vector<double> v6 = v0.p1;
    s3 v16 = v3;
    const std::vector<std::vector<s0>> v13 = v9.p0;
    v3.p0 = v10;
    const s1 v20 = v16.p0;
    const std::vector<s0> v17 = v13[1];
    const s0 v22 = v17[0];
    std::vector<std::vector<s0>> v35 = v13;
    s1 v25 = v9;
    const std::vector<std::vector<double>> v24 = v22.p1;
    v9.p0 = v13;
    v16.p1 = v6;
    const std::vector<s0> v30 = v35[0];
    v25.p0 = v35;
    const s3 v29(v25, v1);
    s3 v69 = v3;
    std::vector<std::vector<double>> v43 = v24;
    s0 v44 = v22;
    const std::vector<double> v33 = v29.p1;
    const std::vector<s0> v34 = v13[1];
    const std::vector<std::vector<s0>> v27 = v25.p0;
    const std::vector<std::vector<s0>> v54 = v20.p1;
    const std::vector<std::vector<double>> v39 { v33, v7, v6, v8, v1 };
    const s2 v56(v30, v44);
    v25.p1 = v54;
    const std::vector<double> v47 = v39[1];
    v3.p0 = v25;
    const std::vector<s0> v81 = v27[0];
    std::vector<std::vector<double>> v37 = v39;
    const std::vector<double> v107 = v37[1];
    v25.p1 = v54;
    s0 v60 = v22;
    const s6 v32(v69, v56);
    std::vector<std::vector<s0>> v75 = v27;
    const s2 v48 = v32.p1;
    const std::vector<s0> v65 = v54[1];
    v35[2] = v65;
    v9.p1 = v54;
    v37[3] = v47;
    s2 v71 = v48;
    v69.p1 = v107;
    const std::vector<std::vector<std::vector<s0>>> v101 { v75 };
    v75[0] = v65;
    v44.p1 = v43;
    const std::vector<std::vector<s0>> v82 = v101[0];
    const std::vector<std::vector<double>> v120 = v60.p1;
    v16.p1 = v5;
    v69.p1 = v5;
    v25.p0 = v82;
    v71.p0 = v30;
    const s5 v317(v69, v71);
    v75[1] = v34;
    v75[2] = v81;
    const s3 v176 = v317.p0;
    v44.p1 = v120;
    return v176;
  }
  s2 f6(const s2 &v0) {
    s2 v8 = v0;
    v8 = v0;
    const std::vector<s0> v1 = v0.p0;
    const s0 v3 = v1[0];
    const s0 v7 = v1[0];
    const std::vector<s0> v10 = v8.p0;
    const s0 v5 = v10[0];
    const std::vector<std::vector<double>> v6 = v7.p0;
    const std::vector<s0> v30 = v0.p0;
    std::vector<s0> v9 = v30;
    v9[0] = v3;
    s0 v13 = v3;
    const std::vector<std::vector<double>> v16 = v5.p0;
    std::vector<s0> v11 = v9;
    const s2 v14(v9, v5);
    const s0 v29 = v11[0];
    const s0 v12 = v10[0];
    v11[0] = v12;
    const std::vector<std::vector<double>> v34 = v12.p0;
    const s0 v18 = v30[0];
    s0 v60 = v13;
    v9[0] = v60;
    s0 v38 = v60;
    v9[0] = v60;
    v13.p0 = v6;
    const std::vector<std::vector<double>> v44 = v12.p1;
    v11[0] = v18;
    const std::vector<std::vector<double>> v35 = v13.p0;
    const std::vector<double> v40 = v34[1];
    const std::vector<std::vector<double>> v26 = v29.p1;
    std::vector<std::vector<double>> v46 = v26;
    const s0 v69 = v14.p1;
    v38.p1 = v46;
    v9[0] = v38;
    s0 v86 = v69;
    v86.p0 = v6;
    v9[0] = v86;
    v13.p1 = v26;
    const std::vector<std::vector<double>> v74 = v60.p0;
    v13.p0 = v35;
    v13.p0 = v16;
    v13.p0 = v74;
    v46[0] = v40;
    v13.p1 = v44;
    return v14;
  }
  s7 f3(const s7 &v0) {
    s7 v7 = v0;
    s7 v5 = v7;
    const std::vector<s6> v2 = v5.p0;
    const std::vector<std::vector<s3>> v3 = v7.p1;
    s7 v1 = v7;
    s7 v6 = v7;
    const std::vector<s3> v10 = v3[0];
    std::vector<std::vector<s3>> v33 = v3;
    const std::vector<s6> v31 = v6.p0;
    v5 = v1;
    v33[0] = v10;
    s7 v19 = v6;
    const std::vector<s3> v17 = v33[0];
    v7.p1 = v33;
    std::vector<std::vector<s3>> v30 = v33;
    v33[0] = v17;
    v19.p1 = v30;
    v6.p1 = v30;
    const std::vector<s3> v35 = f12(v10);
    std::vector<s6> v27 = v2;
    v33[0] = v35;
    v1 = v5;
    v33[0] = v35;
    const s6 v89 = v27[0];
    v27[0] = v89;
    std::vector<s6> v82 = v27;
    v30[0] = v35;
    v5 = v0;
    v33[0] = v17;
    v27 = v31;
    const std::vector<s7> v79 { v19, v5, v1, v6 };
    v19.p0 = v82;
    const s7 v56 = v79[1];
    return v56;
  }
  __attribute__((noinline))
  double f0(const s2 &v0, const s7 &v1, const s10 &v2, const double &v3) {
    double v4 = v3;
    s10 v8 = v2;
    const s2 v7 = f6(v0);
    const s4 v9 = v8.p0;
    const s7 v6 = f3(v1);
    s4 v13 = v9;
    const s2 v14 = f6(v0);
    const s7 v17 = f3(v6);
    s4 v15 = v13;
    const std::vector<std::vector<s3>> v18 = v17.p1;
    const std::vector<s1> v21 = v2.p1;
    const std::vector<s3> v28 = v18[0];
    const std::vector<s0> v29 = v0.p0;
    v8 = v2;
    std::vector<s0> v19 = v29;
    const std::vector<s3> v20 = v18[0];
    const std::vector<s3> v16 = f12(v28);
    std::vector<s3> v25 = v20;
    const double v42 = v4 * v4;
    const s4 v39 = f11(v9, v14);
    const s4 v51 = f11(v13, v14);
    double v33 = v4;
    v8.p0 = v51;
    const std::vector<s0> v30 = v7.p0;
    const s0 v41 = v19[0];
    const s10 v26(v15, v21);
    const s4 v22 = v26.p0;
    s4 v68 = v39;
    const std::vector<s0> v48 = v22.p0;
    const std::vector<s3> v43 = v68.p1;
    v15.p1 = v16;
    const s3 v53 = v25[0];
    const std::vector<std::vector<double>> v36 = v41.p1;
    const s3 v32 = v20[0];
    s0 v54 = v41;
    const std::vector<double> v34 = v36[0];
    v13.p1 = v43;
    std::vector<std::vector<double>> v58 = v36;
    const s3 v50 = f7(v32);
    v58[0] = v34;
    v25[0] = v50;
    const std::vector<std::vector<double>> v114 = v54.p0;
    v13.p0 = v48;
    const double v86 = v42 * v33;
    v25[0] = v53;
    std::vector<s3> v52 = v43;
    v68.p1 = v28;
    std::vector<double> v128 = v34;
    const s3 v98 = v52[0];
    v52[0] = v53;
    const s0 v63 = v30[0];
    std::vector<std::vector<double>> v120 = v58;
    v15.p0 = v48;
    v68 = v15;
    double v118 = v86;
    v68.p0 = v48;
    std::vector<std::vector<double>> v97 = v114;
    v15.p0 = v48;
    v19[0] = v63;
    std::vector<double> v99 = v128;
    const s0 v158 = v29[0];
    v19[0] = v158;
    const std::vector<s0> v168 = v15.p0;
    v52[0] = v32;
    v52[0] = v98;
    const double v136 = v99[0];
    const s0 v153 = v168[1];
    double v196 = v42;
    const double v293 = v118 - v196;
    std::vector<std::vector<double>> v152 = v97;
    const std::vector<s0> v124 = v68.p0;
    v19[0] = v153;
    v128[0] = v293;
    const std::vector<double> v173 = v152[1];
    v15.p1 = v52;
    v54.p1 = v120;
    v99 = v173;
    v68.p0 = v124;
    return v136;
  }
  int main() {
    s2 v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { 3.0 }, { 4.0 } }, { { 5.0 } } } });
    s7 v1({ { { { { { { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } }, { { { { 12.0 }, { 13.0 } }, { { 14.0 } } } } }, { { { { { 15.0 }, { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } } } }, { 21.0, 22.0 } }, { { { { { 23.0 }, { 24.0 } }, { { 25.0 } } } }, { { { 26.0 }, { 27.0 } }, { { 28.0 } } } } }, { { { { { { { { 29.0 }, { 30.0 } }, { { 31.0 } } } }, { { { { 32.0 }, { 33.0 } }, { { 34.0 } } } }, { { { { 35.0 }, { 36.0 } }, { { 37.0 } } } } }, { { { { { 38.0 }, { 39.0 } }, { { 40.0 } } } }, { { { { 41.0 }, { 42.0 } }, { { 43.0 } } } } } }, { 44.0, 45.0 } }, { { { { { 46.0 }, { 47.0 } }, { { 48.0 } } } }, { { { 49.0 }, { 50.0 } }, { { 51.0 } } } } } }, { { { { { { { { { 52.0 }, { 53.0 } }, { { 54.0 } } } }, { { { { 55.0 }, { 56.0 } }, { { 57.0 } } } }, { { { { 58.0 }, { 59.0 } }, { { 60.0 } } } } }, { { { { { 61.0 }, { 62.0 } }, { { 63.0 } } } }, { { { { 64.0 }, { 65.0 } }, { { 66.0 } } } } } }, { 67.0, 68.0 } } } } });
    s10 v2({ { { { { { 69.0 }, { 70.0 } }, { { 71.0 } } }, { { { 72.0 }, { 73.0 } }, { { 74.0 } } } }, { { { { { { { { 75.0 }, { 76.0 } }, { { 77.0 } } } }, { { { { 78.0 }, { 79.0 } }, { { 80.0 } } } }, { { { { 81.0 }, { 82.0 } }, { { 83.0 } } } } }, { { { { { 84.0 }, { 85.0 } }, { { 86.0 } } } }, { { { { 87.0 }, { 88.0 } }, { { 89.0 } } } } } }, { 90.0, 91.0 } } } }, { { { { { { { 92.0 }, { 93.0 } }, { { 94.0 } } } }, { { { { 95.0 }, { 96.0 } }, { { 97.0 } } } }, { { { { 98.0 }, { 99.0 } }, { { 100.0 } } } } }, { { { { { 101.0 }, { 102.0 } }, { { 103.0 } } } }, { { { { 104.0 }, { 105.0 } }, { { 106.0 } } } } } } } });
    double v3(107.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
