  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    double p1;
    s0(std::vector<std::vector<double>> v0, double v1): p0(v0), p1(v1) { }
  };
  struct s1 {
    std::vector<s0> p0;
    std::vector<std::vector<s0>> p1;
    s1(std::vector<s0> v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  struct s4 {
    s0 p0;
    std::vector<s1> p1;
    s4(s0 v0, std::vector<s1> v1): p0(v0), p1(v1) { }
  };
  s1 f75(const s1 &v0) {
    return v0;
  }
  double f72(const double &v0) {
    double v2 = v0;
    double v1 = v0;
    double v5 = v1;
    double v6 = v0;
    double v10 = v1;
    const std::vector<double> v8 { v0, v2, v1, v6 };
    double v11 = v6;
    std::vector<double> v3 = v8;
    v3[1] = v1;
    v3 = v8;
    v3[1] = v5;
    const double v9 = v8[2];
    std::vector<double> v18 = v3;
    std::vector<double> v28 = v3;
    const std::vector<std::vector<double>> v13 { v8, v28, v3 };
    const std::vector<double> v17 = v13[0];
    std::vector<std::vector<double>> v20 = v13;
    v3[2] = v10;
    std::vector<std::vector<double>> v14 = v20;
    v20[0] = v17;
    v14[1] = v28;
    const std::vector<double> v21 = v14[2];
    std::vector<double> v19 = v3;
    v18[1] = v0;
    const std::vector<double> v12 = v13[0];
    std::vector<double> v29 = v17;
    const double v23 = v12[3];
    const std::vector<double> v27 = v14[1];
    const std::vector<std::vector<double>> v22 { v27, v18, v17, v12, v17, v29, v17 };
    v3[3] = v5;
    v14[0] = v8;
    v18[2] = v6;
    std::vector<std::vector<double>> v31 = v22;
    const std::vector<double> v56 = v20[1];
    v19[1] = v1;
    v14[0] = v27;
    v31[6] = v56;
    v29[0] = v11;
    v10 = v9;
    const std::vector<std::vector<std::vector<double>>> v67 { v31, v22, v22, v22, v31, v31 };
    std::vector<std::vector<double>> v66 = v22;
    const std::vector<std::vector<double>> v52 = v67[1];
    v31 = v66;
    const std::vector<std::vector<std::vector<double>>> v44 { v31, v52, v66, v52, v31, v22, v66 };
    v20[2] = v17;
    std::vector<std::vector<std::vector<double>>> v42 = v44;
    const std::vector<std::vector<double>> v76 = v67[4];
    v29[3] = v0;
    const std::vector<std::vector<double>> v43 = v42[5];
    v42[6] = v31;
    v14[2] = v19;
    v3[2] = v23;
    v14[1] = v29;
    v31 = v43;
    v20 = v14;
    v31 = v66;
    const std::vector<double> v81 = v76[4];
    const double v103 = v3[3];
    v10 = v11;
    const double v59 = v21[0];
    v14[1] = v81;
    v19[3] = v103;
    return v59;
  }
  s0 f69(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const double v2 = v0.p1;
    const std::vector<double> v4 = v7[0];
    const double v12 = v0.p1;
    double v17 = v2;
    const std::vector<std::vector<double>> v14 = v0.p0;
    const std::vector<std::vector<double>> v9 = v0.p0;
    const double v18 = v4[0];
    const double v20 = f72(v17);
    const double v24 = f72(v18);
    std::vector<std::vector<double>> v38 = v9;
    const std::vector<std::vector<double>> v27 = v0.p0;
    v38[0] = v4;
    const double v32 = f72(v24);
    const s0 v35(v38, v20);
    const std::vector<std::vector<double>> v28 = v35.p0;
    s0 v23 = v35;
    v23.p0 = v14;
    const std::vector<double> v55 = v27[0];
    v23.p0 = v38;
    v38[0] = v55;
    v23.p1 = v32;
    v23.p1 = v12;
    v23.p0 = v28;
    return v23;
  }
  s4 f68(const s4 &v0, const s1 &v1) {
    s4 v8 = v0;
    const std::vector<s1> v11 = v8.p1;
    s4 v24 = v0;
    const std::vector<std::vector<s1>> v9 { v11, v11 };
    const std::vector<s1> v12 = v9[0];
    const s0 v31 = v24.p0;
    s0 v29 = v31;
    v8.p1 = v11;
    const s4 v27(v29, v12);
    return v27;
  }
  s1 f51(const s1 &v0, const std::vector<std::vector<s0>> &v1) {
    const s1 v6 = f75(v0);
    const s1 v3 = f75(v6);
    const s1 v8 = f75(v6);
    std::vector<std::vector<s0>> v2 = v1;
    const std::vector<std::vector<s0>> v5 = v6.p1;
    std::vector<std::vector<s0>> v14 = v2;
    const std::vector<s0> v41 = v5[0];
    const std::vector<s0> v51 = v14[0];
    const s1 v38(v51, v5);
    const std::vector<s0> v54 = v8.p0;
    const s1 v65 = f75(v38);
    const std::vector<s0> v47 = v3.p0;
    v14[0] = v47;
    const s1 v79 = f75(v65);
    std::vector<std::vector<s0>> v118 = v1;
    const std::vector<s0> v73 = v118[0];
    v14 = v1;
    v14[0] = v51;
    s1 v367 = v79;
    v367.p0 = v41;
    v367.p0 = v73;
    v367.p0 = v54;
    return v367;
  }
  s0 f24(const s1 &v0, const s0 &v1) {
    s0 v6 = v1;
    s1 v3 = v0;
    s1 v7 = v3;
    const std::vector<s1> v4 { v3, v0, v0, v7 };
    const double v5 = v6.p1;
    double v8 = v5;
    const std::vector<std::vector<s0>> v9 = v7.p1;
    const double v11 = f72(v8);
    const std::vector<s0> v2 = v9[0];
    v7.p1 = v9;
    const s0 v16 = f69(v1);
    s1 v17 = v3;
    v3.p1 = v9;
    v6.p1 = v11;
    s0 v21 = v6;
    const s0 v33 = f69(v1);
    const s0 v15 = f69(v21);
    const s1 v24 = v4[1];
    const s0 v23 = f69(v6);
    const std::vector<s0> v29 = v7.p0;
    s0 v14 = v16;
    const s1 v18 = f75(v7);
    const std::vector<std::vector<s0>> v19 = v18.p1;
    const double v31 = f72(v11);
    std::vector<s0> v52 = v29;
    const s1 v22 = v4[3];
    const std::vector<std::vector<s0>> v49 = v17.p1;
    v52[0] = v23;
    const double v26 = v33.p1;
    v52[0] = v33;
    v6.p1 = v11;
    v52[0] = v14;
    v52[0] = v15;
    const double v32 = f72(v26);
    const std::vector<std::vector<s0>> v41 { v52 };
    const s1 v30 = f51(v22, v41);
    const std::vector<s0> v51 = v3.p0;
    std::vector<std::vector<s0>> v45 = v19;
    const std::vector<s0> v39 = v49[0];
    const s0 v37 = v52[0];
    v7.p0 = v39;
    v21.p1 = v32;
    v3.p0 = v51;
    std::vector<s0> v66 = v39;
    v66[0] = v21;
    const s0 v36 = f69(v23);
    const std::vector<std::vector<s0>> v58 = v30.p1;
    v52[0] = v36;
    s1 v46 = v24;
    const std::vector<std::vector<s0>> v91 = v24.p1;
    v46.p0 = v2;
    v3.p0 = v66;
    v7.p0 = v2;
    v14 = v21;
    v6.p1 = v31;
    v66[0] = v36;
    v7.p1 = v49;
    v6 = v36;
    v21 = v36;
    v7.p0 = v39;
    v46.p1 = v58;
    const double v85 = v23.p1;
    const std::vector<std::vector<s0>> v235 = v30.p1;
    v14.p1 = v85;
    v17.p1 = v91;
    v52[0] = v1;
    v3.p1 = v45;
    const std::vector<s0> v349 = v46.p0;
    v17.p1 = v235;
    v7.p0 = v52;
    v3.p0 = v52;
    v3.p0 = v349;
    return v37;
  }
  __attribute__((noinline))
  double f0(const s4 &v0, const double &v1) {
    s4 v7 = v0;
    const std::vector<s1> v3 = v7.p1;
    const std::vector<s1> v11 = v7.p1;
    const s1 v15 = v3[0];
    v7.p1 = v3;
    const s4 v19 = f68(v7, v15);
    const s0 v20 = v19.p0;
    const s1 v13 = v11[0];
    const s1 v9 = f75(v13);
    const std::vector<s1> v33 = v7.p1;
    v7.p1 = v33;
    v7.p1 = v33;
    const std::vector<s1> v14 = v19.p1;
    const s0 v57 = f24(v9, v20);
    v7.p1 = v14;
    const s0 v97 = v19.p0;
    v7.p0 = v97;
    v7.p0 = v97;
    const std::vector<std::vector<double>> v115 = v57.p0;
    v7.p1 = v33;
    const std::vector<double> v138 = v115[0];
    const double v144 = v138[0];
    return v144;
  }
  int main() {
    s4 v0({ { { { 0.0 } }, 1.0 }, { { { { { { 2.0 } }, 3.0 } }, { { { { { 4.0 } }, 5.0 } }, { { { { 6.0 } }, 7.0 } }, { { { { 8.0 } }, 9.0 } } } } } });
    double v1(10.0);
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
