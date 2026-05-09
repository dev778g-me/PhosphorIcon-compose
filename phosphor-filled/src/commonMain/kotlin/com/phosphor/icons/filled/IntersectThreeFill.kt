package com.phosphor.icons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Filled.IntersectThreeFill: ImageVector
    get() {
        if (_IntersectThreeFill != null) {
            return _IntersectThreeFill!!
        }
        _IntersectThreeFill = ImageVector.Builder(
            name = "Filled.IntersectThreeFill",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(fill = SolidColor(Color.Black)) {
                moveTo(195.88f, 96f)
                curveToRelative(0.07f, -1.31f, 0.12f, -2.63f, 0.12f, -4f)
                arcTo(68f, 68f, 0f, isMoreThanHalf = false, isPositiveArc = false, 60f, 92f)
                curveToRelative(0f, 1.33f, 0f, 2.65f, 0.12f, 4f)
                arcTo(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 213.65f)
                arcTo(68f, 68f, 0f, isMoreThanHalf = true, isPositiveArc = false, 195.88f, 96f)
                close()
                moveTo(128f, 193.47f)
                arcToRelative(51.89f, 51.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, -16f, -35.38f)
                arcToRelative(67.55f, 67.55f, 0f, isMoreThanHalf = false, isPositiveArc = false, 31.9f, 0f)
                arcTo(51.89f, 51.89f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 193.47f)
                close()
                moveTo(99.23f, 135.29f)
                arcTo(52.19f, 52.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, 77.92f, 106f)
                arcToRelative(51.88f, 51.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 36.79f, 3.28f)
                arcTo(68.17f, 68.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 99.23f, 135.29f)
                close()
                moveTo(141.29f, 109.23f)
                arcTo(51.88f, 51.88f, 0f, isMoreThanHalf = false, isPositiveArc = true, 178.08f, 106f)
                arcToRelative(52.19f, 52.19f, 0f, isMoreThanHalf = false, isPositiveArc = true, -21.31f, 29.34f)
                arcTo(68.17f, 68.17f, 0f, isMoreThanHalf = false, isPositiveArc = false, 141.29f, 109.23f)
                close()
                moveTo(128f, 40f)
                arcTo(52.06f, 52.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 180f, 89.91f)
                arcTo(67.72f, 67.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 98.35f)
                arcToRelative(67.72f, 67.72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -51.95f, -8.44f)
                arcTo(52.06f, 52.06f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 40f)
                close()
                moveTo(40f, 156f)
                arcToRelative(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 23.23f, -43.29f)
                arcTo(68.36f, 68.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 96.12f, 152f)
                curveToRelative(-0.07f, 1.31f, -0.12f, 2.63f, -0.12f, 4f)
                arcToRelative(67.74f, 67.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 18.71f, 46.77f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 156f)
                close()
                moveTo(164f, 208f)
                arcToRelative(51.65f, 51.65f, 0f, isMoreThanHalf = false, isPositiveArc = true, -22.71f, -5.23f)
                arcTo(67.74f, 67.74f, 0f, isMoreThanHalf = false, isPositiveArc = false, 160f, 156f)
                curveToRelative(0f, -1.33f, -0.05f, -2.65f, -0.12f, -4f)
                arcToRelative(68.36f, 68.36f, 0f, isMoreThanHalf = false, isPositiveArc = false, 32.89f, -39.33f)
                arcTo(52f, 52f, 0f, isMoreThanHalf = false, isPositiveArc = true, 164f, 208f)
                close()
            }
        }.build()

        return _IntersectThreeFill!!
    }

@Suppress("ObjectPropertyName")
private var _IntersectThreeFill: ImageVector? = null
