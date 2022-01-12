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
  struct s3 {
    std::vector<s1> p0;
    std::vector<std::vector<s0>> p1;
    s3(std::vector<s1> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  std::vector<std::vector<s0>> f72(const std::vector<std::vector<s0>> &v0) {
    const std::vector<s0> v6 = v0[0];
    const s0 v7 = v6[0];
    const std::vector<s0> v3 = v0[0];
    s0 v9 = v7;
    const std::vector<std::vector<double>> v12 = v7.p0;
    const std::vector<s0> v2 = v0[0];
    const std::vector<std::vector<double>> v1 = v9.p1;
    std::vector<s0> v4 = v2;
    const s0 v13 = v3[0];
    const std::vector<std::vector<double>> v10 = v13.p0;
    std::vector<s0> v5 = v3;
    const s0 v16 = v6[0];
    v4[0] = v7;
    s0 v20 = v9;
    v9 = v20;
    v9.p1 = v12;
    s0 v23 = v13;
    v20.p1 = v12;
    s0 v35 = v7;
    const std::vector<std::vector<double>> v29 = v35.p0;
    const std::vector<s0> v31 = v0[0];
    const s0 v17 = v5[0];
    v20.p1 = v12;
    s0 v43 = v13;
    std::vector<std::vector<double>> v59 = v29;
    v35.p1 = v59;
    const s1 v58(v4, v23);
    const std::vector<std::vector<double>> v78 = v16.p0;
    s1 v66 = v58;
    const std::vector<s0> v64 = v66.p0;
    const s0 v76(v1, v59);
    v4[0] = v43;
    v9.p1 = v29;
    const std::vector<std::vector<double>> v57 = v76.p0;
    std::vector<std::vector<double>> v60 = v57;
    const std::vector<s0> v97 = v58.p0;
    const s0 v51 = v31[0];
    const s0 v149 = v97[0];
    v23.p0 = v1;
    v5[0] = v51;
    const std::vector<double> v68 = v10[1];
    v23.p1 = v60;
    v43.p1 = v1;
    const std::vector<std::vector<double>> v133 = v9.p1;
    v60 = v57;
    const std::vector<std::vector<double>> v70 = v16.p1;
    v9.p1 = v133;
    std::vector<std::vector<s0>> v124 = v0;
    const std::vector<std::vector<double>> v55 = v43.p0;
    const std::vector<std::vector<double>> v85 = v149.p0;
    v5[0] = v35;
    v20.p0 = v70;
    const std::vector<std::vector<double>> v108 = v76.p1;
    v20.p0 = v55;
    v59[2] = v68;
    v124[1] = v64;
    v35.p1 = v57;
    v4[0] = v17;
    v5[0] = v20;
    v20.p0 = v85;
    v35.p0 = v108;
    v66.p0 = v97;
    v9.p0 = v108;
    v23.p1 = v78;
    return v124;
  }
  std::vector<s1> f66(const std::vector<s1> &v0) {
    std::vector<s1> v5 = v0;
    const s1 v8 = v0[0];
    const s1 v6 = v0[0];
    s1 v3 = v6;
    const std::vector<s0> v4 = v3.p0;
    const s1 v1 = v5[0];
    std::vector<s1> v11 = v5;
    const std::vector<s0> v2 = v8.p0;
    v3.p0 = v4;
    const s0 v10 = v8.p1;
    const s0 v15 = v1.p1;
    v11[0] = v1;
    const s1 v17 = v5[0];
    v5[0] = v17;
    const std::vector<s1> v22 { v8 };
    v11[0] = v17;
    v3.p0 = v2;
    v5[0] = v3;
    const s0 v38 = v6.p1;
    v3.p1 = v38;
    v3.p1 = v15;
    v3.p1 = v10;
    const s1 v34 = v0[0];
    v5[0] = v3;
    const s1 v56 = v0[0];
    const s0 v36 = v34.p1;
    v3.p1 = v36;
    v3.p0 = v4;
    v5 = v22;
    const s0 v42 = v56.p1;
    v3.p1 = v36;
    v5[0] = v8;
    v3.p1 = v42;
    v11[0] = v34;
    return v11;
  }
  s3 f4(const s3 &v0) {
    return v0;
  }
  s3 f2(const s3 &v0) {
    s3 v6 = v0;
    const std::vector<s1> v1 = v0.p0;
    const std::vector<s3> v4 { v6, v6 };
    const s3 v9 = f4(v6);
    const std::vector<s1> v7 = f66(v1);
    const s1 v3 = v1[0];
    const std::vector<s1> v10 = f66(v7);
    const s3 v18 = f4(v6);
    std::vector<s3> v2 = v4;
    const s1 v8 = v10[0];
    const std::vector<s1> v11 { v8, v8, v3, v8 };
    const s1 v16 = v11[0];
    std::vector<s1> v12 = v7;
    const std::vector<std::vector<s0>> v19 = v9.p1;
    std::vector<std::vector<s0>> v31 = v19;
    const std::vector<s0> v44 = v16.p0;
    const s3 v29(v7, v19);
    const std::vector<s1> v50 = f66(v12);
    const s0 v33 = v44[0];
    const std::vector<s0> v38 = v31[1];
    s1 v43 = v3;
    const std::vector<std::vector<s0>> v24 = f72(v19);
    const std::vector<std::vector<s0>> v45 = f72(v31);
    const std::vector<s1> v32 = f66(v50);
    const s3 v85 = v4[0];
    s3 v71 = v85;
    v12[0] = v43;
    const std::vector<s1> v36 = f66(v10);
    const std::vector<std::vector<s0>> v39 = f72(v24);
    v12[0] = v43;
    const s3 v61 = v2[1];
    v2[1] = v18;
    v6.p0 = v12;
    const std::vector<s1> v54 = f66(v7);
    const std::vector<s1> v115 = v29.p0;
    std::vector<s0> v56 = v38;
    v2[1] = v9;
    const std::vector<std::vector<s0>> v89 = v71.p1;
    v6.p1 = v89;
    v6.p0 = v36;
    v31[0] = v56;
    const std::vector<std::vector<s1>> v80 { v10, v10, v54, v32, v50, v115, v36 };
    const std::vector<s1> v102 = v80[5];
    v71.p0 = v102;
    v71.p1 = v39;
    v56[0] = v33;
    v71.p1 = v45;
    return v61;
  }
  __attribute__((noinline))
  double f0(const std::vector<s3> &v0, const double &v1) {
    const s3 v3 = v0[1];
    const double v12 = v1 * v1;
    const s3 v8 = f2(v3);
    const std::vector<double> v2 { v1, v12, v12, v12 };
    const s3 v13 = f4(v8);
    const std::vector<std::vector<s0>> v11 = v13.p1;
    double v24 = v12;
    double v9 = v12;
    std::vector<double> v30 = v2;
    v30[1] = v1;
    v30[3] = v24;
    const double v10 = v30[2];
    v30[2] = v9;
    const std::vector<s0> v43 = v11[0];
    const s0 v36 = v43[0];
    v9 = v10;
    const std::vector<std::vector<double>> v96 = v36.p1;
    const std::vector<double> v69 = v96[0];
    const double v99 = v69[0];
    v30[2] = v99;
    return v10;
  }
  int main() {
    std::vector<s3> v0({ { { { { { { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 }, { 5.0 } } } }, { { { 6.0 }, { 7.0 }, { 8.0 } }, { { 9.0 }, { 10.0 }, { 11.0 } } } } }, { { { { { 12.0 }, { 13.0 }, { 14.0 } }, { { 15.0 }, { 16.0 }, { 17.0 } } } }, { { { { 18.0 }, { 19.0 }, { 20.0 } }, { { 21.0 }, { 22.0 }, { 23.0 } } } }, { { { { 24.0 }, { 25.0 }, { 26.0 } }, { { 27.0 }, { 28.0 }, { 29.0 } } } } } }, { { { { { { { 30.0 }, { 31.0 }, { 32.0 } }, { { 33.0 }, { 34.0 }, { 35.0 } } } }, { { { 36.0 }, { 37.0 }, { 38.0 } }, { { 39.0 }, { 40.0 }, { 41.0 } } } } }, { { { { { 42.0 }, { 43.0 }, { 44.0 } }, { { 45.0 }, { 46.0 }, { 47.0 } } } }, { { { { 48.0 }, { 49.0 }, { 50.0 } }, { { 51.0 }, { 52.0 }, { 53.0 } } } }, { { { { 54.0 }, { 55.0 }, { 56.0 } }, { { 57.0 }, { 58.0 }, { 59.0 } } } } } }, { { { { { { { 60.0 }, { 61.0 }, { 62.0 } }, { { 63.0 }, { 64.0 }, { 65.0 } } } }, { { { 66.0 }, { 67.0 }, { 68.0 } }, { { 69.0 }, { 70.0 }, { 71.0 } } } } }, { { { { { 72.0 }, { 73.0 }, { 74.0 } }, { { 75.0 }, { 76.0 }, { 77.0 } } } }, { { { { 78.0 }, { 79.0 }, { 80.0 } }, { { 81.0 }, { 82.0 }, { 83.0 } } } }, { { { { 84.0 }, { 85.0 }, { 86.0 } }, { { 87.0 }, { 88.0 }, { 89.0 } } } } } } });
    double v1(90.0);
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
