  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  func f24(_ v0: Double) -> Double {
    let v6: Double = v0 / v0
    var v7: Double = v0
    var v1: Double = v7
    var v4: Double = v1
    var v13: Double = v0
    var v9: Double = v4
    var v3: Double = v9
    let v15: Double = v13 * v13
    let v10: [Double] = [v1, v9, v15, v3]
    var v30: Double = v6
    var v22: [Double] = v10
    var v14: [Double] = v22
    let v28: Double = v22[0]
    var v46: Double = v28
    v22[1] = v1
    v22[1] = v4
    v14[0] = v46
    v3 = v6
    v22[3] = v30
    var v23: [Double] = v14
    var v51: [Double] = v23
    v51[1] = v28
    let v41: Double = v51[1]
    return v41
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: Double) -> Double {
    let v3: Double = f24(v1)
    var v5: Double = v3
    v5 = v3
    let v38: Double = f24(v5)
    return v38
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0], [4.0], [5.0]]), s0(p0: [[6.0], [7.0], [8.0]], p1: [[9.0], [10.0], [11.0]])]
    let v1: Double = 12.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 12.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
