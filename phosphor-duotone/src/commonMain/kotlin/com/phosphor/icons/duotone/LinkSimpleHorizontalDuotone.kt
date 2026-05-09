package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.LinkSimpleHorizontalDuotone: ImageVector
    get() {
        if (_LinkSimpleHorizontalDuotone != null) {
            return _LinkSimpleHorizontalDuotone!!
        }
        _LinkSimpleHorizontalDuotone = ImageVector.Builder(
            name = "Duotone.LinkSimpleHorizontalDuotone",
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
                moveTo(64f, 80f)
                lineTo(192f, 80f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 240f, 128f)
                lineTo(240f, 128f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 192f, 176f)
                lineTo(64f, 176f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 16f, 128f)
                lineTo(16f, 128f)
                arcTo(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 64f, 80f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80f, 128f)
                lineTo(176f, 128f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 176f)
                horizontalLineTo(64f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 0f, -96f)
                horizontalLineToRelative(40f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 80f)
                horizontalLineToRelative(40f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 48f)
                horizontalLineToRelative(0f)
                arcToRelative(48f, 48f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 48f)
                horizontalLineTo(152f)
            }
        }.build()

        return _LinkSimpleHorizontalDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _LinkSimpleHorizontalDuotone: ImageVector? = null
