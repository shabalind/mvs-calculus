  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: s0
  }
  @inline(never)
  func f0(_ v0: [s1], _ v1: Double) -> Double {
    let v5: s1 = v0[0]
    let v7: s0 = v5.p1
    var v10: Double = v1
    v10 = v1
    let v12: [[Double]] = v7.p0
    let v19: [Double] = v12[1]
    let v32: Double = v19[0]
    let v51: Double = v19[0]
    let v55: [Double] = [v10, v32, v1, v32, v32, v51, v10]
    var v62: [Double] = v55
    let v132: Double = v62[1]
    var v145: Double = v132
    v62[3] = v32
    return v145
  }
  func benchmark() {
    let v0: [s1] = [s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], p1: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])), s1(p0: [s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]), s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]])], p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))]
    let v1: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
