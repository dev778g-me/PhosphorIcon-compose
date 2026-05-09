package com.phosphor.icons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Bold.SwordBold: ImageVector
    get() {
        if (_SwordBold != null) {
            return _SwordBold!!
        }
        _SwordBold = ImageVector.Builder(
            name = "Bold.SwordBold",
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
                moveTo(38.35f, 131.03f)
                lineTo(55.03f, 114.35f)
                arcTo(8.01f, 8.01f, 90f, isMoreThanHalf = false, isPositiveArc = true, 66.36f, 114.35f)
                lineTo(141.65f, 189.63f)
                arcTo(8.01f, 8.01f, 90f, isMoreThanHalf = false, isPositiveArc = true, 141.65f, 200.96f)
                lineTo(124.96f, 217.65f)
                arcTo(8.01f, 8.01f, 90f, isMoreThanHalf = false, isPositiveArc = true, 113.63f, 217.65f)
                lineTo(38.35f, 142.36f)
                arcTo(8.01f, 8.01f, 90f, isMoreThanHalf = false, isPositiveArc = true, 38.35f, 131.03f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(160f, 96f)
                lineTo(104f, 152f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(80.44f, 128.43f)
                lineToRelative(71.56f, -88.43f)
                lineToRelative(64f, 0f)
                lineToRelative(0f, 64f)
                lineToRelative(-88.43f, 71.56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 24f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(62f, 166f)
                lineTo(32.34f, 195.65f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 11.32f)
                lineTo(49f, 223.66f)
                arcToRelative(8f, 8f, 0f, isMoreThanHalf = false, isPositiveArc = false, 11.32f, 0f)
                lineTo(90f, 194f)
            }
        }.build()

        return _SwordBold!!
    }

@Suppress("ObjectPropertyName")
private var _SwordBold: ImageVector? = null
