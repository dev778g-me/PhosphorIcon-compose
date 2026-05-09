package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.TreePalmDuotone: ImageVector
    get() {
        if (_TreePalmDuotone != null) {
            return _TreePalmDuotone!!
        }
        _TreePalmDuotone = ImageVector.Builder(
            name = "Duotone.TreePalmDuotone",
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
                moveTo(188.92f, 40f)
                arcToRelative(59.29f, 59.29f, 0f, isMoreThanHalf = false, isPositiveArc = false, -43.08f, 18.75f)
                arcTo(65.47f, 65.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 104f)
                lineTo(232f, 58.75f)
                arcTo(59.28f, 59.28f, 0f, isMoreThanHalf = false, isPositiveArc = false, 188.92f, 40f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(176.56f, 98.18f)
                arcTo(64.2f, 64.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 128f, 104.52f)
                lineTo(221.81f, 176f)
                arcToRelative(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = false, -6.39f, -48.22f)
                arcTo(63.73f, 63.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, 176.56f, 98.18f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(110.16f, 58.75f)
                arcToRelative(58.87f, 58.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -86.16f, 0f)
                lineTo(128f, 104f)
                arcTo(65.47f, 65.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, 110.16f, 58.75f)
                close()
            }
            path(
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                strokeAlpha = 0.2f
            ) {
                moveTo(79.44f, 98.18f)
                arcToRelative(63.73f, 63.73f, 0f, isMoreThanHalf = false, isPositiveArc = false, -38.86f, 29.6f)
                arcTo(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.19f, 176f)
                lineTo(128f, 104.52f)
                arcTo(64.2f, 64.2f, 0f, isMoreThanHalf = false, isPositiveArc = false, 79.44f, 98.18f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104f)
                arcToRelative(65.47f, 65.47f, 0f, isMoreThanHalf = false, isPositiveArc = true, 17.84f, -45.25f)
                arcToRelative(58.87f, 58.87f, 0f, isMoreThanHalf = false, isPositiveArc = true, 86.16f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.52f)
                arcToRelative(64.26f, 64.26f, 0f, isMoreThanHalf = false, isPositiveArc = true, 87.42f, 23.26f)
                arcTo(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = true, 221.81f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104f)
                arcToRelative(65.47f, 65.47f, 0f, isMoreThanHalf = false, isPositiveArc = false, -17.84f, -45.25f)
                arcToRelative(58.87f, 58.87f, 0f, isMoreThanHalf = false, isPositiveArc = false, -86.16f, 0f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.52f)
                arcToRelative(64.26f, 64.26f, 0f, isMoreThanHalf = false, isPositiveArc = false, -87.42f, 23.26f)
                arcTo(63f, 63f, 0f, isMoreThanHalf = false, isPositiveArc = false, 34.19f, 176f)
                close()
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(128f, 104.52f)
                lineTo(128f, 224f)
            }
        }.build()

        return _TreePalmDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _TreePalmDuotone: ImageVector? = null
