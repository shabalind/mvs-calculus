  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: [s0]
    var p1: [s0]
  }
  func f15(_ v0: s0) -> s0 {
    let v4: [s0] = [v0, v0, v0, v0, v0]
    let v1: [s0] = [v0, v0, v0, v0, v0, v0, v0]
    let v6: s0 = v4[1]
    var v19: [s0] = v1
    let v23: s0 = v19[0]
    v19[4] = v6
    var v61: s0 = v23
    return v61
  }
  @inline(never)
  func f0(_ v0: s0, _ v1: s1, _ v2: Double) -> Double {
    let v9: s0 = f15(v0)
    let v13: [[Double]] = v9.p0
    let v57: [Double] = v13[1]
    let v87: Double = v57[0]
    return v87
  }
  func benchmark() {
    let v0: s0 = s0(p0: [[0.0], [1.0], [2.0]], p1: [[3.0]])
    let v1: s1 = s1(p0: [s0(p0: [[4.0], [5.0], [6.0]], p1: [[7.0]])], p1: [s0(p0: [[8.0], [9.0], [10.0]], p1: [[11.0]]), s0(p0: [[12.0], [13.0], [14.0]], p1: [[15.0]]), s0(p0: [[16.0], [17.0], [18.0]], p1: [[19.0]])])
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
