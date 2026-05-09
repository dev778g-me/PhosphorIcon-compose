package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.HandsPrayingBold: ImageVector
    get() {
        if (_HandsPrayingBold != null) {
            return _HandsPrayingBold!!
        }
        _HandsPrayingBold = ImageVector.Builder(
            name = "Bold.HandsPrayingBold",
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
                moveTo(141.78f, 16f)
                horizontalLineToRelative(0f)
                arcTo(13.77f, 13.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 155f, 25.78f)
                lineTo(192f, 148f)
                lineToRelative(16.27f, 16.27f)
                lineToRelative(-45f, 43f)
                lineToRelative(-25.94f, -25.94f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 158.75f)
                verticalLineToRelative(-129f)
                arcTo(13.78f, 13.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.78f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(163.31f, 207.31f)
                lineToRelative(22.35f, 22.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineTo(229.66f, 197f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.31f)
                lineToRelative(-22.35f, -22.35f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(118.63f, 181.37f)
                lineTo(92.69f, 207.31f)
                lineToRelative(-44f, -44f)
                lineTo(64f, 148f)
                lineTo(101f, 25.78f)
                arcTo(13.77f, 13.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 114.22f, 16f)
                horizontalLineToRelative(0f)
                arcTo(13.78f, 13.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 29.78f)
                verticalLineToRelative(129f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 118.63f, 181.37f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(48.69f, 163.31f)
                lineTo(26.34f, 185.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                lineTo(59f, 229.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineToRelative(22.35f, -22.35f)
            }
        }.build()

        return _HandsPrayingBold!!
    }

@Suppress("ObjectPropertyName")
private var _HandsPrayingBold: ImageVector? = null
