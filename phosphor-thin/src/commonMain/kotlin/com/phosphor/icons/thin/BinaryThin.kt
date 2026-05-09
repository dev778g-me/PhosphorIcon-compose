package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.BinaryThin: ImageVector
    get() {
        if (_BinaryThin != null) {
            return _BinaryThin!!
        }
        _BinaryThin = ImageVector.Builder(
            name = "Thin.BinaryThin",
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
                moveTo(64f, 72f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 0f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -60f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(136f, 184f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, 60f, 0f)
                arcToRelative(30f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = false, -60f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(176f, 112f)
                lineToRelative(0f, -80f)
                lineToRelative(-24f, 13.33f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(96f, 224f)
                lineToRelative(0f, -80f)
                lineToRelative(-24f, 13.33f)
            }
        }.build()

        return _BinaryThin!!
    }

@Suppress("ObjectPropertyName")
private var _BinaryThin: ImageVector? = null
