  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [Double]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: Double) -> Double {
    let v8: s0 = v0[1]
    var v6: s0 = v8
    let v5: [Double] = v6.p1
    let v11: [Double] = v6.p1
    let v3: Double = v5[1]
    let v12: [Double] = v8.p1
    let v9: [Double] = v6.p1
    v6.p1 = v9
    let v19: s0 = v0[2]
    let v20: Double = v3 * v3
    let v16: s0 = v1[1]
    v6.p1 = v12
    v6.p1 = v11
    let v42: [Double] = v16.p1
    v6.p1 = v42
    let v35: [[Double]] = v19.p0
    v6.p0 = v35
    return v20
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [3.0, 4.0]), s0(p0: [[5.0], [6.0], [7.0]], p1: [8.0, 9.0]), s0(p0: [[10.0], [11.0], [12.0]], p1: [13.0, 14.0])]
    let v1: [s0] = [s0(p0: [[15.0], [16.0], [17.0]], p1: [18.0, 19.0]), s0(p0: [[20.0], [21.0], [22.0]], p1: [23.0, 24.0]), s0(p0: [[25.0], [26.0], [27.0]], p1: [28.0, 29.0])]
    let v2: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
