  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [[s0]]
  }
  struct s5 {
    var p0: s1
    var p1: [s0]
  }
  @inline(never)
  func f0(_ v0: s5, _ v1: Double) -> Double {
    let v6: s1 = v0.p0
    let v13: [[s0]] = v6.p1
    var v11: [[s0]] = v13
    var v21: [[s0]] = v13
    let v23: [s0] = v11[1]
    let v18: [s0] = v21[2]
    let v22: s0 = v23[0]
    let v24: [[Double]] = v22.p0
    let v56: [Double] = v24[0]
    let v44: [[Double]] = [v56, v56, v56]
    var v42: [[Double]] = v44
    let v79: [Double] = v42[1]
    v42 = v44
    let v125: Double = v79[0]
    var v285: [[Double]] = v44
    let v167: [Double] = v285[2]
    v11[2] = v18
    v42 = v285
    v285[2] = v167
    return v125
  }
  func benchmark() {
    let v0: s5 = s5(p0: s1(p0: [s0(p0: [[0.0]], p1: [[1.0], [2.0]])], p1: [[s0(p0: [[3.0]], p1: [[4.0], [5.0]])], [s0(p0: [[6.0]], p1: [[7.0], [8.0]])], [s0(p0: [[9.0]], p1: [[10.0], [11.0]])]]), p1: [s0(p0: [[12.0]], p1: [[13.0], [14.0]]), s0(p0: [[15.0]], p1: [[16.0], [17.0]]), s0(p0: [[18.0]], p1: [[19.0], [20.0]])])
    let v1: Double = 21.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 21.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
