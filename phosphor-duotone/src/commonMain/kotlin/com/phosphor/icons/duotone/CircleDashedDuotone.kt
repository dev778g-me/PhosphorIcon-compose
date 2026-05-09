package com.phosphor.icons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Duotone.CircleDashedDuotone: ImageVector
    get() {
        if (_CircleDashedDuotone != null) {
            return _CircleDashedDuotone!!
        }
        _CircleDashedDuotone = ImageVector.Builder(
            name = "Duotone.CircleDashedDuotone",
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
                moveTo(128f, 128f)
                moveToRelative(-96f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, 192f, 0f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = true, isPositiveArc = true, -192f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 35f)
                arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(35.49f, 102.3f)
                arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -41.56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(59.49f, 195.27f)
                arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, -41.58f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 221f)
                arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220.51f, 153.7f)
                arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, -24f, 41.56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 16f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196.51f, 60.73f)
                arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 41.58f)
            }
        }.build()

        return _CircleDashedDuotone!!
    }

@Suppress("ObjectPropertyName")
private var _CircleDashedDuotone: ImageVector? = null
