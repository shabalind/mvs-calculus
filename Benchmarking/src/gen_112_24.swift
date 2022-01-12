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
  func f0(_ v0: [[s1]], _ v1: Double) -> Double {
    let v4: [s1] = v0[0]
    let v3: s1 = v4[0]
    let v6: [s0] = v3.p0
    let v28: s0 = v6[0]
    let v19: [[Double]] = v28.p0
    let v29: [Double] = v19[1]
    var v40: [Double] = v29
    let v45: Double = v29[0]
    v40[0] = v45
    let v36: Double = v40[0]
    v40[0] = v36
    v40[0] = v36
    let v208: Double = v1 + v36
    return v208
  }
  func benchmark() {
    let v0: [[s1]] = [[s1(p0: [s0(p0: [[0.0], [1.0]], p1: [[2.0]])], p1: s0(p0: [[3.0], [4.0]], p1: [[5.0]]))], [s1(p0: [s0(p0: [[6.0], [7.0]], p1: [[8.0]])], p1: s0(p0: [[9.0], [10.0]], p1: [[11.0]]))], [s1(p0: [s0(p0: [[12.0], [13.0]], p1: [[14.0]])], p1: s0(p0: [[15.0], [16.0]], p1: [[17.0]]))]]
    let v1: Double = 18.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 18.0
    for _ in 1...1000 {
      result = f0(v0, v1)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
