package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.PanoramaBold: ImageVector
    get() {
        if (_PanoramaBold != null) {
            return _PanoramaBold!!
        }
        _PanoramaBold = ImageVector.Builder(
            name = "Bold.PanoramaBold",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 64f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10.05f, -7.74f)
                curveTo(43.35f, 60.89f, 81.44f, 72f, 128f, 72f)
                reflectiveCurveTo(212.65f, 60.89f, 230f, 56.27f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 64f)
                verticalLineTo(192f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -10.06f, 7.73f)
                curveTo(212.63f, 195.08f, 174.55f, 184f, 128f, 184f)
                reflectiveCurveTo(43.37f, 195.08f, 26.06f, 199.72f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 192f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(200f, 108f)
                moveToRelative(-16f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, 32f, 0f)
                arcToRelative(16f, 16f, 0f, isMoreThanHalf = true, isPositiveArc = true, -32f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 164.69f)
                lineToRelative(54.34f, -54.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.32f, 0f)
                lineToRelative(75f, 75f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(131.31f, 160f)
                lineTo(157f, 134.34f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 11.31f, 0f)
                lineToRelative(65.47f, 65.47f)
            }
        }.build()

        return _PanoramaBold!!
    }

@Suppress("ObjectPropertyName")
private var _PanoramaBold: ImageVector? = null
