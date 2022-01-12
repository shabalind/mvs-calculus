  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s6 {
    var p0: s0
    var p1: s0
  }
  struct s8 {
    var p0: s0
  }
  @inline(never)
  func f0(_ v0: [[s0]], _ v1: s8, _ v2: [s6], _ v3: Double) -> Double {
    var v16: Double = v3
    let v15: [s0] = v0[1]
    let v35: s0 = v15[0]
    let v17: [[Double]] = v35.p1
    let v20: [Double] = v17[0]
    let v39: Double = v16 * v3
    var v63: [Double] = v20
    let v100: Double = v20[0]
    let v71: Double = v63[0]
    let v94: Double = v39 - v71
    let v98: Double = v100 * v94
    let v146: Double = v98 / v39
    return v146
  }
  func benchmark() {
    let v0: [[s0]] = [[s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]])], [s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]])], [s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]])]]
    let v1: s8 = s8(p0: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))
    let v2: [s6] = [s6(p0: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]), p1: s0(p0: [[25.0], [26.0]], p1: [[27.0], [28.0], [29.0]]))]
    let v3: Double = 30.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 30.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2, v3)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
