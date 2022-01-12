  import Dispatch
  struct s0 {
    var p0: [[Double]]
    var p1: [[Double]]
  }
  struct s1 {
    var p0: s0
    var p1: s0
  }
  struct s2 {
    var p0: [s1]
    var p1: s0
  }
  func f5(_ v0: s0, _ v1: s2, _ v2: s0) -> s0 {
    let v5: s0 = v1.p1
    let v4: s1 = s1(p0: v2, p1: v0)
    let v3: [s1] = v1.p0
    let v15: s1 = v3[0]
    var v8: s1 = v4
    let v10: s0 = v15.p1
    let v24: s0 = v4.p1
    var v21: s0 = v2
    v8.p0 = v0
    var v23: s2 = v1
    var v39: s2 = v23
    var v40: s1 = v8
    let v73: s0 = v40.p0
    let v54: s0 = v39.p1
    let v66: [[Double]] = v0.p0
    v21.p0 = v66
    v8.p0 = v54
    let v65: [s0] = [v73, v54, v54, v5, v10]
    v39.p1 = v5
    let v145: s0 = v65[2]
    v39.p1 = v21
    v39.p1 = v24
    v23.p1 = v10
    return v145
  }
  @inline(never)
  func f0(_ v0: s1, _ v1: s2, _ v2: Double) -> Double {
    var v5: s1 = v0
    let v11: s0 = v5.p1
    let v12: s0 = v0.p0
    var v4: s0 = v12
    v5.p0 = v4
    v5.p1 = v4
    let v20: s0 = f5(v11, v1, v4)
    let v17: [[Double]] = v4.p1
    let v24: [[Double]] = v11.p1
    v4.p1 = v17
    let v34: [Double] = v24[1]
    let v123: Double = v34[0]
    var v216: s0 = v20
    v4 = v216
    return v123
  }
  func benchmark() {
    let v0: s1 = s1(p0: s0(p0: [[0.0], [1.0]], p1: [[2.0], [3.0], [4.0]]), p1: s0(p0: [[5.0], [6.0]], p1: [[7.0], [8.0], [9.0]]))
    let v1: s2 = s2(p0: [s1(p0: s0(p0: [[10.0], [11.0]], p1: [[12.0], [13.0], [14.0]]), p1: s0(p0: [[15.0], [16.0]], p1: [[17.0], [18.0], [19.0]]))], p1: s0(p0: [[20.0], [21.0]], p1: [[22.0], [23.0], [24.0]]))
    let v2: Double = 25.0
    let start = DispatchTime.now().uptimeNanoseconds
    var result: Double = 25.0
    for _ in 1...1000 {
      result = f0(v0, v1, v2)
    }
    let end = DispatchTime.now().uptimeNanoseconds
    print(result)
    print(end - start)
  }
  benchmark()
