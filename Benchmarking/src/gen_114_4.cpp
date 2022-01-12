  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2): p0(v0), p1(v1), p2(v2) { }
  };
  struct s1 {
    s0 p0;
    s0 p1;
    s1(s0 v0, s0 v1): p0(v0), p1(v1) { }
  };
  s0 f18(const s0 &v0) {
    const std::vector<std::vector<double>> v7 = v0.p0;
    const std::vector<std::vector<double>> v8 = v0.p0;
    const std::vector<std::vector<double>> v6 = v0.p0;
    const s0 v2(v8, v6, v7);
    const std::vector<std::vector<double>> v17 = v0.p2;
    const std::vector<std::vector<double>> v11 = v0.p0;
    const std::vector<std::vector<double>> v40 = v0.p1;
    const s0 v26(v17, v11, v6);
    s0 v56 = v26;
    const s1 v51(v2, v56);
    s1 v52 = v51;
    v56.p0 = v40;
    const s0 v62 = v52.p1;
    v56.p0 = v7;
    const s0 v100 = v52.p0;
    v52.p0 = v62;
    return v100;
  }
  std::vector<s0> f15(const s1 &v0, const std::vector<s0> &v1) {
    const s0 v3 = v0.p1;
    std::vector<s0> v44 = v1;
    v44[0] = v3;
    v44 = v1;
    return v44;
  }
  s0 f12(const s0 &v0) {
    s0 v3 = v0;
    const s0 v6 = f18(v0);
    const s0 v7 = f18(v6);
    s0 v1 = v6;
    const std::vector<std::vector<double>> v4 = v6.p0;
    const s1 v8(v0, v0);
    const std::vector<std::vector<double>> v9 = v6.p1;
    const std::vector<std::vector<double>> v5 = v1.p1;
    s0 v13 = v7;
    const s0 v11 = f18(v7);
    const s0 v14 = f18(v7);
    const s1 v18(v1, v6);
    const s0 v16 = v8.p0;
    const s0 v20 = f18(v14);
    s1 v21 = v18;
    const std::vector<std::vector<double>> v23 = v1.p0;
    v1.p1 = v23;
    s1 v35 = v18;
    const std::vector<std::vector<double>> v36 = v20.p0;
    const std::vector<std::vector<double>> v44 = v14.p0;
    v1.p2 = v5;
    s1 v42 = v21;
    v1.p1 = v44;
    v3.p2 = v9;
    v3.p2 = v5;
    v42.p1 = v16;
    const std::vector<s0> v58 { v3 };
    v35.p1 = v11;
    const s0 v37 = v18.p1;
    v1.p2 = v4;
    v35.p1 = v7;
    s1 v68 = v42;
    const std::vector<s0> v96 = f15(v68, v58);
    const std::vector<s0> v27 = f15(v21, v96);
    const s0 v29 = v27[0];
    s1 v52 = v18;
    const s0 v65 = v52.p1;
    v1.p1 = v36;
    s1 v66 = v35;
    const std::vector<s0> v118 = f15(v8, v96);
    const s0 v64 = v68.p0;
    const s0 v98 = v66.p0;
    v1 = v65;
    const s0 v82 = v118[0];
    v66.p0 = v6;
    const s1 v117(v65, v13);
    v66.p0 = v29;
    v52.p0 = v20;
    v52 = v117;
    v42.p0 = v37;
    const s0 v95 = f18(v82);
    v68.p1 = v95;
    v35.p0 = v64;
    v35.p1 = v3;
    return v98;
  }
  __attribute__((noinline))
  double f0(const s1 &v0, const double &v1) {
    const s0 v6 = v0.p0;
    const s0 v3 = f12(v6);
    s1 v2 = v0;
    s1 v10 = v2;
    v2.p0 = v3;
    const s0 v15 = v10.p1;
    const s0 v20 = v0.p0;
    v10.p1 = v20;
    const std::vector<std::vector<double>> v39 = v15.p2;
    const s0 v16 = f12(v3);
    v10.p0 = v16;
    const std::vector<double> v14 = v39[0];
    const double v50 = v14[0];
    return v50;
  }
  int main() {
    s1 v0({ { { { 0.0 } }, { { 1.0 } }, { { 2.0 } } }, { { { 3.0 } }, { { 4.0 } }, { { 5.0 } } } });
    double v1(6.0);
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
