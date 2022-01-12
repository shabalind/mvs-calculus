  #include <vector>
  #include <iostream>
  #include <chrono>
  struct s0 {
    std::vector<std::vector<double>> p0;
    std::vector<std::vector<double>> p1;
    std::vector<std::vector<double>> p2;
    std::vector<std::vector<double>> p3;
    s0(std::vector<std::vector<double>> v0, std::vector<std::vector<double>> v1, std::vector<std::vector<double>> v2, std::vector<std::vector<double>> v3): p0(v0), p1(v1), p2(v2), p3(v3) { }
  };
  s0 f93(const s0 &v0) {
    const std::vector<std::vector<double>> v2 = v0.p2;
    const std::vector<std::vector<double>> v12 = v0.p3;
    const std::vector<double> v3 = v12[1];
    const std::vector<double> v7 = v12[0];
    const std::vector<std::vector<double>> v8 = v0.p3;
    const std::vector<std::vector<double>> v25 = v0.p0;
    std::vector<std::vector<double>> v15 = v12;
    const s0 v17(v2, v15, v25, v15);
    const std::vector<std::vector<double>> v30 = v17.p1;
    v15[0] = v3;
    std::vector<std::vector<double>> v20 = v8;
    const std::vector<std::vector<double>> v28 = v0.p1;
    v20[1] = v7;
    const std::vector<std::vector<double>> v27 = v0.p2;
    const s0 v35(v27, v20, v27, v30);
    const std::vector<double> v48 = v28[0];
    const std::vector<std::vector<double>> v40 = v35.p0;
    v15[1] = v48;
    const s0 v124(v25, v30, v40, v12);
    return v124;
  }
  s0 f89(const s0 &v0) {
    const s0 v1 = f93(v0);
    const s0 v2 = f93(v0);
    const std::vector<std::vector<double>> v10 = v2.p1;
    const std::vector<std::vector<double>> v24 = v1.p0;
    const std::vector<std::vector<double>> v12 = v2.p3;
    const s0 v15(v24, v12, v24, v10);
    const s0 v186 = f93(v15);
    return v186;
  }
  __attribute__((noinline))
  double f0(const s0 &v0, const double &v1) {
    const std::vector<std::vector<double>> v7 = v0.p2;
    s0 v4 = v0;
    const std::vector<std::vector<double>> v5 = v4.p1;
    std::vector<std::vector<double>> v8 = v7;
    s0 v10 = v4;
    const std::vector<double> v3 = v7[0];
    v4 = v0;
    v4 = v0;
    const s0 v18 = f89(v10);
    const std::vector<std::vector<double>> v16 = v18.p1;
    const std::vector<std::vector<double>> v11 = v10.p3;
    const std::vector<std::vector<double>> v14 = v10.p2;
    const std::vector<std::vector<double>> v43 = v18.p3;
    const std::vector<std::vector<std::vector<double>>> v15 { v7, v8 };
    v8[1] = v3;
    const s0 v22 = f89(v10);
    const s0 v24 = f89(v4);
    s0 v34 = v22;
    v8[0] = v3;
    const std::vector<double> v25 = v5[1];
    v8[2] = v25;
    const std::vector<std::vector<double>> v36 = v34.p0;
    const s0 v66 = f93(v4);
    v8[0] = v3;
    v4.p2 = v7;
    const std::vector<std::vector<double>> v32 = v24.p1;
    const std::vector<std::vector<double>> v41 = v15[0];
    v8[0] = v3;
    v8[2] = v3;
    v8[2] = v3;
    v8[2] = v25;
    v10.p1 = v43;
    const std::vector<std::vector<double>> v27 = v34.p0;
    const std::vector<std::vector<double>> v30 = v66.p1;
    v4.p2 = v8;
    v4.p0 = v14;
    std::vector<double> v31 = v25;
    const s0 v37 = f89(v0);
    v34.p1 = v11;
    v4.p0 = v27;
    v31[0] = v1;
    v34.p2 = v36;
    const std::vector<std::vector<double>> v53 = v15[0];
    v4.p0 = v41;
    const std::vector<std::vector<double>> v46 = v37.p3;
    v34.p2 = v7;
    v8[2] = v31;
    v34.p1 = v32;
    const std::vector<std::vector<double>> v152 = v34.p1;
    v34.p1 = v16;
    v10.p0 = v53;
    v4.p1 = v46;
    v10.p3 = v152;
    const double v115 = v31[0];
    v10.p3 = v30;
    const std::vector<std::vector<double>> v172 = v15[0];
    v10.p2 = v172;
    v10.p1 = v43;
    return v115;
  }
  int main() {
    s0 v0({ { { 0.0 }, { 1.0 }, { 2.0 } }, { { 3.0 }, { 4.0 } }, { { 5.0 }, { 6.0 }, { 7.0 } }, { { 8.0 }, { 9.0 } } });
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
