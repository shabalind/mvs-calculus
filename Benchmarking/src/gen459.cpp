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
  struct s2 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s2(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s3 {
    std::vector<s2> p0;
    s3(std::vector<s2> v0): p0(v0) { }
  };
  struct s4 {
    s1 p0;
    std::vector<std::vector<s3>> p1;
    s4(s1 v0, std::vector<std::vector<s3>> v1): p0(v0), p1(v1) { }
  };
  s3 f42(const s0 &v0, const s3 &v1) {
    s3 v17 = v1;
    return v17;
  }
  s0 f39(const s0 &v0) {
    const std::vector<s0> v1 { v0 };
    const s0 v13 = v1[0];
    const s1 v10(v1, v13);
    s1 v36 = v10;
    const std::vector<s1> v71 { v36, v36, v10, v10, v10, v36 };
    const s1 v28 = v71[4];
    const s0 v38 = v28.p1;
    return v38;
  }
  s0 f22(const s0 &v0) {
    s0 v3 = v0;
    s0 v2 = v3;
    const s0 v1 = f39(v3);
    s0 v9 = v1;
    const s0 v5 = f39(v0);
    const s0 v4 = f39(v5);
    const s0 v12 = f39(v2);
    const std::vector<std::vector<double>> v13 = v12.p1;
    const std::vector<s0> v26 { v9, v0, v5, v0, v4, v0 };
    const s0 v17 = v26[2];
    const std::vector<std::vector<double>> v27 = v3.p1;
    const std::vector<std::vector<double>> v30 = v9.p0;
    const std::vector<std::vector<double>> v32 = v5.p0;
    std::vector<s0> v51 = v26;
    v2.p0 = v27;
    v2.p1 = v30;
    const std::vector<std::vector<double>> v44 = v4.p0;
    v2.p0 = v44;
    v51 = v26;
    const std::vector<std::vector<double>> v62 = v17.p1;
    v51[3] = v12;
    v2.p0 = v13;
    const std::vector<std::vector<s0>> v117 { v26, v26, v51, v51, v26, v26 };
    const std::vector<std::vector<double>> v40 = v3.p1;
    v3.p0 = v62;
    const std::vector<s0> v122 = v117[0];
    v9.p0 = v44;
    v3.p0 = v32;
    v2.p0 = v40;
    v3.p1 = v30;
    const s0 v78 = v122[3];
    return v78;
  }
  double f12(const double &v0, const s3 &v1) {
    s3 v4 = v1;
    v4 = v1;
    const std::vector<s2> v2 = v4.p0;
    std::vector<s2> v6 = v2;
    v4.p0 = v6;
    const std::vector<s2> v7 = v4.p0;
    const std::vector<s2> v8 = v4.p0;
    const s2 v13 = v7[0];
    v4.p0 = v7;
    const s2 v9 = v8[0];
    v6[0] = v13;
    v6[0] = v9;
    const s2 v14 = v6[0];
    const std::vector<s2> v26 = v4.p0;
    const std::vector<s2> v18 = v4.p0;
    const std::vector<s2> v15 = v1.p0;
    const s2 v10 = v26[0];
    v4.p0 = v26;
    v6[0] = v14;
    const s2 v20 = v2[0];
    const s3 v21(v18);
    const s2 v34 = v18[0];
    const s2 v33 = v18[0];
    std::vector<s2> v19 = v18;
    const s2 v27 = v6[0];
    s2 v30 = v10;
    s3 v16 = v4;
    const s3 v54(v6);
    v4.p0 = v26;
    const std::vector<std::vector<s0>> v29 = v27.p1;
    v30.p1 = v29;
    const std::vector<std::vector<s2>> v50 { v6 };
    const s2 v43 = v18[0];
    v19[0] = v20;
    const std::vector<std::vector<s0>> v28 = v9.p1;
    v6[0] = v20;
    s3 v17 = v16;
    v19[0] = v9;
    std::vector<std::vector<s0>> v24 = v29;
    std::vector<s2> v35 = v19;
    const std::vector<s2> v38 = v50[0];
    const std::vector<s1> v36 = v34.p0;
    const s2 v66 = v35[0];
    const std::vector<s2> v45 = v17.p0;
    const s2 v65 = v19[0];
    v16.p0 = v15;
    v30.p1 = v28;
    s2 v49 = v30;
    const std::vector<s1> v59 = v49.p0;
    const std::vector<s2> v37 = v21.p0;
    std::vector<s1> v68 = v36;
    const std::vector<s2> v39 = v54.p0;
    const s3 v67(v39);
    const std::vector<s1> v61 = v49.p0;
    v19[0] = v33;
    v6[0] = v33;
    v17.p0 = v38;
    v35[0] = v13;
    v4.p0 = v39;
    v49.p1 = v28;
    v6[0] = v66;
    const s1 v53 = v68[2];
    const s1 v85 = v59[1];
    const std::vector<s0> v41 = v53.p0;
    v16.p0 = v2;
    v30.p0 = v59;
    const std::vector<s1> v130 = v27.p0;
    v49.p0 = v61;
    v17 = v67;
    const s1 v90 = v59[0];
    v4.p0 = v38;
    const s2 v122 = v38[0];
    const s0 v120 = v85.p1;
    v17.p0 = v35;
    v4.p0 = v45;
    const s0 v69 = v90.p1;
    v24[0] = v41;
    const s0 v71 = f22(v69);
    v35[0] = v43;
    const s1 v104 = v130[1];
    v68[1] = v104;
    v30.p0 = v130;
    const s0 v72 = f22(v120);
    v19[0] = v10;
    const s3 v142 = f42(v72, v67);
    v16.p0 = v45;
    v30.p1 = v24;
    const std::vector<std::vector<double>> v113 = v71.p1;
    v19[0] = v122;
    v4.p0 = v37;
    v68[0] = v104;
    const std::vector<std::vector<s0>> v134 = v13.p1;
    v30.p1 = v134;
    v30.p0 = v59;
    const std::vector<double> v105 = v113[0];
    v6[0] = v65;
    v17 = v142;
    const double v402 = v105[0];
    return v402;
  }
  __attribute__((noinline))
  double f0(const std::vector<s4> &v0, const std::vector<s0> &v1, const double &v2) {
    const s0 v6 = v1[0];
    const std::vector<std::vector<double>> v7 = v6.p0;
    const std::vector<double> v23 = v7[0];
    const double v14 = v23[0];
    const s4 v21 = v0[0];
    const std::vector<std::vector<s3>> v27 = v21.p1;
    const std::vector<s3> v77 = v27[0];
    const s3 v44 = v77[0];
    const double v40 = f12(v14, v44);
    return v40;
  }
  int main() {
    std::vector<s4> v0({ { { { { { { 0.0 } }, { { 1.0 } } } }, { { { 2.0 } }, { { 3.0 } } } }, { { { { { { { { { { { 4.0 } }, { { 5.0 } } } }, { { { 6.0 } }, { { 7.0 } } } }, { { { { { 8.0 } }, { { 9.0 } } } }, { { { 10.0 } }, { { 11.0 } } } }, { { { { { 12.0 } }, { { 13.0 } } } }, { { { 14.0 } }, { { 15.0 } } } } }, { { { { { 16.0 } }, { { 17.0 } } } }, { { { { 18.0 } }, { { 19.0 } } } } } } } } }, { { { { { { { { { { 20.0 } }, { { 21.0 } } } }, { { { 22.0 } }, { { 23.0 } } } }, { { { { { 24.0 } }, { { 25.0 } } } }, { { { 26.0 } }, { { 27.0 } } } }, { { { { { 28.0 } }, { { 29.0 } } } }, { { { 30.0 } }, { { 31.0 } } } } }, { { { { { 32.0 } }, { { 33.0 } } } }, { { { { 34.0 } }, { { 35.0 } } } } } } } } } } }, { { { { { { 36.0 } }, { { 37.0 } } } }, { { { 38.0 } }, { { 39.0 } } } }, { { { { { { { { { { { 40.0 } }, { { 41.0 } } } }, { { { 42.0 } }, { { 43.0 } } } }, { { { { { 44.0 } }, { { 45.0 } } } }, { { { 46.0 } }, { { 47.0 } } } }, { { { { { 48.0 } }, { { 49.0 } } } }, { { { 50.0 } }, { { 51.0 } } } } }, { { { { { 52.0 } }, { { 53.0 } } } }, { { { { 54.0 } }, { { 55.0 } } } } } } } } }, { { { { { { { { { { 56.0 } }, { { 57.0 } } } }, { { { 58.0 } }, { { 59.0 } } } }, { { { { { 60.0 } }, { { 61.0 } } } }, { { { 62.0 } }, { { 63.0 } } } }, { { { { { 64.0 } }, { { 65.0 } } } }, { { { 66.0 } }, { { 67.0 } } } } }, { { { { { 68.0 } }, { { 69.0 } } } }, { { { { 70.0 } }, { { 71.0 } } } } } } } } } } } });
    std::vector<s0> v1({ { { { 72.0 } }, { { 73.0 } } } });
    double v2(74.0);
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
