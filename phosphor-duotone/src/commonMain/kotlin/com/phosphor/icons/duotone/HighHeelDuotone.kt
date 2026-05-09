package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.HighHeelDuotone: ImageVector
    get() {
        if (_HighHeelDuotone != null) {
            return _HighHeelDuotone!!
        }
        _HighHeelDuotone = ImageVector.Builder(
            name = "Duotone.HighHeelDuotone",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(32f, 120f)
                curveToRelative(50.38f, 0f, 93.51f, 31.28f, 111.3f, 75.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.42f, 4.92f)
                horizontalLineTo(240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineToRelative(-4.73f)
                arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.21f, 164f)
                lineTo(176f, 152f)
                lineTo(64f, 40f)
                curveTo(44.59f, 61.22f, 32f, 89f, 32f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(32f, 120f)
                curveToRelative(50.38f, 0f, 93.51f, 31.28f, 111.3f, 75.08f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.42f, 4.92f)
                horizontalLineTo(240f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineToRelative(-4.73f)
                arcTo(23.92f, 23.92f, 0f, isMoreThanHalf = false, isPositiveArc = false, 229.21f, 164f)
                lineTo(176f, 152f)
                lineTo(64f, 40f)
                curveTo(44.59f, 61.22f, 32f, 89f, 32f, 120f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 130f)
                verticalLineToRelative(62f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, 8f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, -8f, -8f)
                verticalLineTo(120f)
            }
        }.build()

        return _HighHeelDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _HighHeelDuotone: ImageVector? = null
