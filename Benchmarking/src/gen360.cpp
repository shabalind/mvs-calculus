  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1): p0(v0), p1(v1) { }
  };
  s0 f26(const s0 &v0, const s0 &v1, const s0 &v2) {
    s0 v3 = v1;
    s0 v4 = v0;
    v3 = v4;
    const std::vector<std::vector<double>> v7 = v3.p1;
    const std::vector<double> v5 = v7[0];
    v3.p1 = v7;
    const double v14 = v5[0];
    const std::vector<std::vector<double>> v13 = v1.p0;
    double v23 = v14;
    const std::vector<std::vector<double>> v21 = v0.p1;
    const std::vector<std::vector<double>> v20 = v4.p0;
    v4.p0 = v13;
    const std::vector<double> v15 = v20[0];
    std::vector<std::vector<double>> v24 = v20;
    v24[0] = v5;
    std::vector<std::vector<double>> v18 = v24;
    v4.p0 = v20;
    s0 v19 = v2;
    v4.p0 = v18;
    std::vector<std::vector<double>> v34 = v18;
    v24[1] = v5;
    s0 v47 = v4;
    v19.p0 = v24;
    std::vector<double> v44 = v15;
    v4.p1 = v21;
    v3.p0 = v34;
    const std::vector<std::vector<double>> v51 = v3.p1;
    v44[0] = v23;
    v19.p1 = v7;
    const std::vector<s0> v37 { v3, v47, v0, v4, v2, v19 };
    const s0 v70 = v37[3];
    v19.p1 = v51;
    const std::vector<std::vector<double>> v102 = v70.p1;
    std::vector<double> v60 = v44;
    v47.p1 = v102;
    v44[0] = v23;
    v44[0] = v23;
    const s0 v107 = v37[2];
    v24[1] = v60;
    return v107;
  }
  s0 f25(const s0 &v0) {
    s0 v2 = v0;
    const std::vector<std::vector<double>> v1 = v2.p1;
    const std::vector<std::vector<double>> v7 = v0.p0;
    std::vector<std::vector<double>> v4 = v1;
    const s0 v3 = f26(v2, v0, v2);
    v2 = v0;
    const s0 v5 = f26(v3, v2, v0);
    const std::vector<double> v6 = v7[1];
    const s0 v9 = f26(v3, v5, v3);
    const std::vector<std::vector<double>> v8 = v3.p1;
    const std::vector<double> v34 = v7[1];
    const std::vector<std::vector<double>> v13 = v3.p0;
    v2.p1 = v8;
    const s0 v17 = f26(v3, v2, v3);
    std::vector<std::vector<double>> v21 = v7;
    std::vector<std::vector<double>> v10 = v4;
    const std::vector<double> v15 = v7[1];
    const std::vector<std::vector<double>> v45 = v3.p1;
    const s0 v23 = f26(v3, v0, v17);
    s0 v14 = v9;
    const s0 v24(v13, v8);
    const std::vector<double> v22 = v8[0];
    v4[0] = v34;
    v21 = v13;
    const s0 v40 = f26(v9, v2, v2);
    const s0 v49 = f26(v0, v0, v23);
    const s0 v26 = f26(v40, v49, v40);
    const s0 v42 = f26(v26, v3, v14);
    const std::vector<std::vector<double>> v41 { v22, v15, v22, v6, v34, v6 };
    const s0 v32 = f26(v23, v2, v26);
    v4 = v45;
    const s0 v62 = f26(v42, v0, v26);
    const s0 v28 = f26(v62, v32, v17);
    v14.p1 = v10;
    const std::vector<std::vector<double>> v44 = v26.p1;
    const std::vector<std::vector<double>> v81 = v28.p1;
    const s0 v54 = f26(v9, v42, v26);
    const s0 v61 = f26(v9, v40, v24);
    v2.p0 = v21;
    const s0 v102 = f26(v26, v62, v5);
    const std::vector<std::vector<double>> v89 = v24.p0;
    const s0 v56 = f26(v42, v42, v26);
    const std::vector<double> v100 = v41[2];
    std::vector<std::vector<double>> v88 = v10;
    const std::vector<std::vector<double>> v57 = v102.p0;
    const std::vector<std::vector<double>> v55 = v49.p0;
    std::vector<std::vector<double>> v103 = v57;
    v14.p1 = v81;
    v14.p1 = v8;
    v14.p1 = v88;
    v2.p0 = v89;
    v14.p0 = v55;
    v21[0] = v100;
    const s0 v118 = f26(v62, v14, v14);
    v14.p0 = v103;
    v2.p1 = v44;
    const s0 v65 = f26(v102, v42, v42);
    v2.p1 = v8;
    const s0 v98 = f26(v65, v9, v3);
    v14 = v118;
    const s0 v157 = f26(v54, v61, v56);
    const s0 v128 = f26(v17, v98, v157);
    return v128;
  }
  s0 f23(const s0 &v0, const s0 &v1) {
    s0 v5 = v1;
    const s0 v7 = f25(v1);
    const std::vector<std::vector<double>> v13 = v5.p0;
    s0 v11 = v5;
    s0 v15 = v5;
    const std::vector<std::vector<double>> v14 = v15.p1;
    const std::vector<std::vector<double>> v19 = v7.p0;
    const std::vector<double> v3 = v13[1];
    const s0 v52 = f25(v1);
    const std::vector<std::vector<double>> v26 = v0.p1;
    std::vector<std::vector<double>> v40 = v13;
    const std::vector<std::vector<double>> v27 = v52.p0;
    v15.p0 = v40;
    v5.p1 = v26;
    v40[0] = v3;
    const std::vector<double> v66 = v14[0];
    std::vector<std::vector<double>> v38 = v19;
    v11.p0 = v27;
    const s0 v67(v38, v14);
    v15.p0 = v40;
    v40[0] = v66;
    const s0 v55 = f26(v67, v11, v11);
    v15.p1 = v26;
    s0 v97 = v55;
    return v97;
  }
  __attribute__((noinline))
  double f0(const std::vector<std::vector<s0>> &v0, const std::vector<std::vector<s0>> &v1, const s0 &v2, const s0 &v3, const std::vector<std::vector<s0>> &v4, const double &v5) {
    const s0 v9 = f23(v3, v3);
    const std::vector<std::vector<double>> v11 = v9.p1;
    const std::vector<double> v31 = v11[0];
    const double v50 = v31[0];
    return v50;
  }
  int main() {
    std::vector<std::vector<s0>> v0({ { { { { 0.0 }, { 1.0 } }, { { 2.0 } } } }, { { { { 3.0 }, { 4.0 } }, { { 5.0 } } } } });
    std::vector<std::vector<s0>> v1({ { { { { 6.0 }, { 7.0 } }, { { 8.0 } } } }, { { { { 9.0 }, { 10.0 } }, { { 11.0 } } } } });
    s0 v2({ { { 12.0 }, { 13.0 } }, { { 14.0 } } });
    s0 v3({ { { 15.0 }, { 16.0 } }, { { 17.0 } } });
    std::vector<std::vector<s0>> v4({ { { { { 18.0 }, { 19.0 } }, { { 20.0 } } } }, { { { { 21.0 }, { 22.0 } }, { { 23.0 } } } }, { { { { 24.0 }, { 25.0 } }, { { 26.0 } } } } });
    double v5(27.0);
    auto start = std::chrono::high_resolution_clock::now();
    double result;
    for (int i = 0; i < 1000; i ++) {
      result = f0(v0, v1, v2, v3, v4, v5);
    }
    auto end = std::chrono::high_resolution_clock::now();
    double value = *((double*) &result);
    std::cout << value << "\n";
    std::cout << std::chrono::duration_cast<std::chrono::nanoseconds>(end-start).count();
    std::cout << "\n";
    return 0;
  }
