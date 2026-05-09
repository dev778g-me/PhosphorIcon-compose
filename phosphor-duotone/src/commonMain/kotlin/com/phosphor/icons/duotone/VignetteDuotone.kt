package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.VignetteDuotone: ImageVector
    get() {
        if (_VignetteDuotone != null) {
            return _VignetteDuotone!!
        }
        _VignetteDuotone = ImageVector.Builder(
            name = "Duotone.VignetteDuotone",
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
                moveTo(216f, 48f)
                horizontalLineTo(40f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -8f, 8f)
                verticalLineTo(200f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, 8f)
                horizontalLineTo(216f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 8f, -8f)
                verticalLineTo(56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 216f, 48f)
                close()
                moveTo(128f, 176f)
                curveToRelative(-35.35f, 0f, -64f, -21.49f, -64f, -48f)
                reflectiveCurveToRelative(28.65f, -48f, 64f, -48f)
                reflectiveCurveToRelative(64f, 21.49f, 64f, 48f)
                reflectiveCurveTo(163.35f, 176f, 128f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(40f, 48f)
                lineTo(216f, 48f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 224f, 56f)
                lineTo(224f, 200f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 216f, 208f)
                lineTo(40f, 208f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 32f, 200f)
                lineTo(32f, 56f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = true, 40f, 48f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(64f, 128f)
                arcToRelative(64f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, 128f, 0f)
                arcToRelative(64f, 48f, 0f, isMoreThanHalf = true, isPositiveArc = false, -128f, 0f)
                close()
            }
        }.build()

        return _VignetteDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _VignetteDuotone: ImageVector? = null
