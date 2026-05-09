package com.phosphor.icons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Regular.OfficeChair: ImageVector
    get() {
        if (_OfficeChair != null) {
            return _OfficeChair!!
        }
        _OfficeChair = ImageVector.Builder(
            name = "Regular.OfficeChair",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(72f, 232f)
                horizontalLineToRelative(0f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -24f)
                horizontalLineToRelative(64f)
                arcToRelative(24f, 24f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 24f)
                horizontalLineToRelative(0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 168f)
                lineTo(128f, 232f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(16f, 128f)
                horizontalLineTo(40f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, 40f)
                horizontalLineToRelative(96f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = false, isPositiveArc = false, 40f, -40f)
                horizontalLineToRelative(24f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(93.72f, 24f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, -7.92f, 6.87f)
                lineToRelative(-13.72f, 96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 80f, 136f)
                horizontalLineToRelative(96f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 7.92f, -9.13f)
                lineToRelative(-13.72f, -96f)
                arcTo(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 162.28f, 24f)
                close()
            }
        }.build()

        return _OfficeChair!!
    }

@Suppress("ObjectPropertyName")
private var _OfficeChair: ImageVector? = null
