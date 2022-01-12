  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  @inline(never)
  func f0(_ v0: [s0], _ v1: s0, _ v2: s0, _ v3: s0, _ v4: Double) -> Double {
    var v6: Double = v4
    let v7: s0 = v0[0]
    let v9: [[Double]] = v7.p1
    var v10: [[Double]] = v9
    let v37: [[Double]] = v3.p0
    let v11: [Double] = v37[1]
    var v26: [Double] = v11
    let v16: [Double] = v37[0]
    v26[0] = v6
    let v20: [[Double]] = v3.p0
    v10[0] = v16
    var v19: [[Double]] = v20
    let v31: [Double] = v10[0]
    let v63: [Double] = v19[1]
    let v66: Double = v31[0]
    v26[0] = v66
    v26[0] = v4
    let v61: [[Double]] = [v26, v26, v63, v11, v63]
    v26[0] = v66
    let v67: [Double] = v61[4]
    let v153: Double = v67[0]
    return v153
  }
  func benchmark() {
    let v0: [s0] = [s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]]), s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])]
    let v1: s0 = s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]])
    let v2: s0 = s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]])
    let v3: s0 = s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])
    let v4: Double = 20.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 20.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3, v4)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
