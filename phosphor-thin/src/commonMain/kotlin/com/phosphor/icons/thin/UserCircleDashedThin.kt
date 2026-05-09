package com.phosphor.icons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.phosphor.icons.PhIcons

val PhIcons.Thin.UserCircleDashedThin: ImageVector
    get() {
        if (_UserCircleDashedThin != null) {
            return _UserCircleDashedThin!!
        }
        _UserCircleDashedThin = ImageVector.Builder(
            name = "Thin.UserCircleDashedThin",
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
                moveTo(128f, 120f)
                moveToRelative(-40f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, 80f, 0f)
                arcToRelative(40f, 40f, 0f, isMoreThanHalf = true, isPositiveArc = true, -80f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(104f, 35f)
                arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, 48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(35.49f, 102.3f)
                arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, -41.56f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(152f, 221f)
                arcToRelative(95.51f, 95.51f, 0f, isMoreThanHalf = false, isPositiveArc = true, -48f, 0f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(196.51f, 60.73f)
                arcToRelative(95.54f, 95.54f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 41.58f)
            }
            path(
                stroke = SolidColor(Color.Black),
                strokeLineWidth = 8f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round
            ) {
                moveTo(220.52f, 153.7f)
                arcToRelative(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, -28.32f, 45.67f)
                arcToRelative(72f, 72f, 0f, isMoreThanHalf = false, isPositiveArc = false, -128.4f, 0f)
                arcTo(96f, 96f, 0f, isMoreThanHalf = false, isPositiveArc = true, 35.48f, 153.7f)
            }
        }.build()

        return _UserCircleDashedThin!!
    }

@Suppress("ObjectPropertyName")
private var _UserCircleDashedThin: ImageVector? = null
