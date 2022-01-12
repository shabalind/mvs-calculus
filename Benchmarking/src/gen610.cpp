  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<double> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<double> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  struct s1 {
    s0 p0;
    std::vector<std::vector<s0>> p1;
    s1(s0 v0, std::vector<std::vector<s0>> v1): p0(v0), p1(v1) { }
  };
  s0 f37(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p3;
    const std::vector<std::vector<double>> v1 = v0.p0;
    s0 v6 = v0;
    const std::vector<std::vector<double>> v4 = v6.p2;
    const std::vector<std::vector<double>> v3 = v6.p3;
    const std::vector<double> v5 = v7[0];
    v6.p3 = v3;
    v6.p1 = v5;
    std::vector<std::vector<double>> v15 = v4;
    v6 = v0;
    const std::vector<std::vector<double>> v10 = v6.p3;
    const std::vector<double> v21 = v4[0];
    v6 = v0;
    const std::vector<double> v31 = v15[1];
    v6.p1 = v31;
    const std::vector<s0> v22 { v6, v6, v0 };
    v6.p1 = v21;
    const std::vector<std::vector<double>> v56 = v0.p0;
    const s0 v28 = v22[2];
    std::vector<std::vector<double>> v79 = v10;
    v6.p0 = v79;
    v6.p0 = v1;
    v6.p0 = v56;
    return v28;
  }
  s1 f27(const s1 &v0) {
    s1 v5 = v0;
    const s0 v1 = v0.p0;
    const s0 v6 = f37(v1);
    const s0 v4 = f37(v6);
    v5.p0 = v4;
    s0 v7 = v4;
    v7 = v4;
    s0 v8 = v6;
    s1 v14 = v0;
    v5.p0 = v8;
    const std::vector<double> v11 = v7.p1;
    const std::vector<std::vector<double>> v2 = v1.p3;
    v8.p1 = v11;
    v7.p0 = v2;
    const std::vector<double> v21 = v2[0];
    const double v36 = v21[0];
    const std::vector<std::vector<s0>> v18 = v14.p1;
    const std::vector<std::vector<double>> v20 = v4.p0;
    const s0 v51 = f37(v1);
    s0 v41 = v1;
    const std::vector<s0> v30 = v18[2];
    const s0 v42 = v0.p0;
    const s0 v32 = v30[0];
    v7 = v6;
    const std::vector<std::vector<s0>> v46 = v0.p1;
    std::vector<double> v57 = v21;
    const std::vector<std::vector<double>> v141 = v7.p3;
    const std::vector<std::vector<double>> v61 = v41.p2;
    const std::vector<std::vector<s0>> v26 = v5.p1;
    const std::vector<double> v59 = v61[0];
    s1 v44 = v14;
    const s0 v83 = v44.p0;
    const double v27 = v59[0];
    v14.p1 = v26;
    v41.p2 = v61;
    const std::vector<std::vector<s0>> v39 = v44.p1;
    const s0 v80 = f37(v83);
    v41 = v51;
    const s0 v94 = f37(v4);
    v44.p0 = v94;
    const std::vector<double> v78 = v61[1];
    v7.p1 = v78;
    const std::vector<std::vector<s0>> v47 = v14.p1;
    s1 v50 = v44;
    v50.p0 = v6;
    v44.p0 = v80;
    const s0 v85 = v50.p0;
    const std::vector<std::vector<s0>> v99 = v5.p1;
    const std::vector<std::vector<s0>> v53 = v50.p1;
    const std::vector<s1> v91 { v44, v50, v50, v5, v14, v14 };
    const s0 v102 = f37(v8);
    const s1 v137 = v91[5];
    std::vector<std::vector<double>> v205 = v61;
    const s0 v132 = v137.p0;
    v7 = v85;
    v8.p3 = v20;
    v50.p0 = v80;
    v44.p0 = v32;
    v57[0] = v36;
    const std::vector<double> v100 = v61[1];
    const s0 v281 = v50.p0;
    v14.p0 = v281;
    v57[0] = v27;
    v14.p0 = v102;
    v5.p1 = v46;
    v5.p1 = v53;
    v8.p1 = v57;
    v205[1] = v100;
    v5.p0 = v42;
    std::vector<std::vector<s0>> v114 = v99;
    v8.p3 = v141;
    v44.p1 = v39;
    v7.p2 = v205;
    v5.p0 = v85;
    v44.p0 = v132;
    v14.p1 = v47;
    v7.p0 = v20;
    v44.p1 = v114;
    s1 v164 = v14;
    s1 v177 = v137;
    v164.p1 = v46;
    v177 = v164;
    return v177;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s1 v7 = f27(v0);
    const s1 v8 = f27(v7);
    const s1 v6 = f27(v0);
    const s1 v10 = f27(v6);
    const std::vector<std::vector<s0>> v4 = v8.p1;
    std::vector<std::vector<s0>> v9 = v4;
    const std::vector<s0> v49 = v9[0];
    const s0 v39 = v10.p0;
    const double v53 = v1 * v1;
    std::vector<s0> v65 = v49;
    v9[1] = v65;
    const s0 v63 = f37(v39);
    s0 v55 = v63;
    const std::vector<std::vector<double>> v59 = v55.p0;
    std::vector<std::vector<double>> v57 = v59;
    const std::vector<std::vector<std::vector<double>>> v136 { v57, v57 };
    std::vector<std::vector<std::vector<double>>> v81 = v136;
    const std::vector<std::vector<double>> v31 = v136[1];
    v55.p0 = v31;
    const s0 v62 = v49[0];
    v81 = v136;
    const std::vector<double> v54 = v59[0];
    const std::vector<std::vector<double>> v122 = v62.p3;
    std::vector<std::vector<double>> v86 = v122;
    const double v95 = v1 / v53;
    const std::vector<std::vector<double>> v88 = v81[0];
    const std::vector<double> v93 = v86[0];
    std::vector<double> v165 = v54;
    v55.p0 = v88;
    v165 = v93;
    v86[0] = v93;
    v9[1] = v65;
    v86[0] = v165;
    v86[0] = v54;
    v165[0] = v95;
    const double v77 = v165[0];
    return v77;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { 1.0 }, { { 2.0 }, { 3.0 } }, { { 4.0 } } }, { { { { { 5.0 } }, { 6.0 }, { { 7.0 }, { 8.0 } }, { { 9.0 } } } }, { { { { 10.0 } }, { 11.0 }, { { 12.0 }, { 13.0 } }, { { 14.0 } } } }, { { { { 15.0 } }, { 16.0 }, { { 17.0 }, { 18.0 } }, { { 19.0 } } } } } });
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
