  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: [s0], _ v2: Double) -> Double {
    var v3: Double = v2
    var v8: [s0] = v1
    let v7: s0 = v0[1]
    v8[1] = v7
    v8[0] = v7
    let v4: Double = v2 * v3
    let v9: s0 = v8[1]
    v8[1] = v7
    v8[2] = v7
    let v15: s0 = v0[1]
    var v35: Double = v2
    let v21: [[Double]] = v9.p1
    let v27: [Double] = v21[1]
    let v33: [[Double]] = v15.p1
    v3 = v2
    var v63: Double = v2
    var v30: [Double] = v27
    let v40: [Double] = v33[0]
    v30[0] = v2
    let v67: Double = v4 / v63
    let v28: Double = v40[0]
    v30[0] = v67
    var v73: [Double] = v40
    v73 = v40
    v73[0] = v3
    let v80: Double = v30[0]
    let v85: Double = v27[0]
    var v88: Double = v80
    v73[0] = v35
    let v86: Double = v73[0]
    let v151: [Double] = [v2, v88, v28, v86, v4]
    let v119: Double = v151[2]
    var v259: Double = v119
    v30[0] = v85
    return v259
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0]]), s0(p0: [[4.0], [5.0]], p1: [[6.0], [7.0]])]
    let v1: [s0] = [s0(p0: [[8.0], [9.0]], p1: [[10.0], [11.0]]), s0(p0: [[12.0], [13.0]], p1: [[14.0], [15.0]]), s0(p0: [[16.0], [17.0]], p1: [[18.0], [19.0]])]
    let v2: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
