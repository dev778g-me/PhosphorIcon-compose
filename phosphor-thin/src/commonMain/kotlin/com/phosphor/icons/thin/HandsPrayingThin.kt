package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.HandsPrayingThin: ImageVector
    get() {
        if (_HandsPrayingThin != null) {
            return _HandsPrayingThin!!
        }
        _HandsPrayingThin = ImageVector.Builder(
            name = "Thin.HandsPrayingThin",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 256f,
            viewportHeight = 256f
        ).apply {
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(141.78f, 16f)
                horizontalLineToRelative(0f)
                arcTo(13.77f, 13.77f, 0f, isMoreThanHalf = false, isPositiveArc = true, 155f, 25.78f)
                lineTo(192f, 148f)
                lineToRelative(20.27f, 20.27f)
                lineToRelative(-45f, 43f)
                lineToRelative(-29.94f, -29.94f)
                arcTo(32f, 32f, 0f, isMoreThanHalf = false, isPositiveArc = true, 128f, 158.75f)
                verticalLineToRelative(-129f)
                arcTo(13.78f, 13.78f, 0f, isMoreThanHalf = false, isPositiveArc = true, 141.78f, 16f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(167.31f, 211.31f)
                lineToRelative(18.35f, 18.35f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineTo(229.66f, 197f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, -11.31f)
                lineToRelative(-18.35f, -18.35f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(118.63f, 181.37f)
                lineTo(88.69f, 211.31f)
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
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(44.69f, 167.31f)
                lineTo(26.34f, 185.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.31f)
                lineTo(59f, 229.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.31f, 0f)
                lineToRelative(18.35f, -18.35f)
            }
        }.build()

        return _HandsPrayingThin!!
    }

@Suppress("ObjectPropertyName")
private var _HandsPrayingThin: ImageVector? = null
